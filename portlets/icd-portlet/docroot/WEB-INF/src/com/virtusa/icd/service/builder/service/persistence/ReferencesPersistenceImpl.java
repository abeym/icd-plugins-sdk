/**
 * Copyright (c) 2000-2012 Liferay, Inc. All rights reserved.
 *
 * This library is free software; you can redistribute it and/or modify it under
 * the terms of the GNU Lesser General Public License as published by the Free
 * Software Foundation; either version 2.1 of the License, or (at your option)
 * any later version.
 *
 * This library is distributed in the hope that it will be useful, but WITHOUT
 * ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS
 * FOR A PARTICULAR PURPOSE. See the GNU Lesser General Public License for more
 * details.
 */

package com.virtusa.icd.service.builder.service.persistence;

import com.liferay.portal.NoSuchModelException;
import com.liferay.portal.kernel.bean.BeanReference;
import com.liferay.portal.kernel.cache.CacheRegistryUtil;
import com.liferay.portal.kernel.dao.orm.EntityCacheUtil;
import com.liferay.portal.kernel.dao.orm.FinderCacheUtil;
import com.liferay.portal.kernel.dao.orm.FinderPath;
import com.liferay.portal.kernel.dao.orm.Query;
import com.liferay.portal.kernel.dao.orm.QueryPos;
import com.liferay.portal.kernel.dao.orm.QueryUtil;
import com.liferay.portal.kernel.dao.orm.Session;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.kernel.util.GetterUtil;
import com.liferay.portal.kernel.util.InstanceFactory;
import com.liferay.portal.kernel.util.OrderByComparator;
import com.liferay.portal.kernel.util.PropsKeys;
import com.liferay.portal.kernel.util.PropsUtil;
import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.kernel.util.StringPool;
import com.liferay.portal.kernel.util.StringUtil;
import com.liferay.portal.kernel.util.Validator;
import com.liferay.portal.model.CacheModel;
import com.liferay.portal.model.ModelListener;
import com.liferay.portal.service.persistence.BatchSessionUtil;
import com.liferay.portal.service.persistence.ResourcePersistence;
import com.liferay.portal.service.persistence.UserPersistence;
import com.liferay.portal.service.persistence.impl.BasePersistenceImpl;

import com.virtusa.icd.service.builder.NoSuchReferencesException;
import com.virtusa.icd.service.builder.model.References;
import com.virtusa.icd.service.builder.model.impl.ReferencesImpl;
import com.virtusa.icd.service.builder.model.impl.ReferencesModelImpl;

import java.io.Serializable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * The persistence implementation for the references service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see ReferencesPersistence
 * @see ReferencesUtil
 * @generated
 */
public class ReferencesPersistenceImpl extends BasePersistenceImpl<References>
	implements ReferencesPersistence {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use {@link ReferencesUtil} to access the references persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY = ReferencesImpl.class.getName();
	public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List1";
	public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List2";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_REFERENCESNAME =
		new FinderPath(ReferencesModelImpl.ENTITY_CACHE_ENABLED,
			ReferencesModelImpl.FINDER_CACHE_ENABLED, ReferencesImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findByreferencesName",
			new String[] {
				String.class.getName(),
				
			"java.lang.Integer", "java.lang.Integer",
				"com.liferay.portal.kernel.util.OrderByComparator"
			});
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_REFERENCESNAME =
		new FinderPath(ReferencesModelImpl.ENTITY_CACHE_ENABLED,
			ReferencesModelImpl.FINDER_CACHE_ENABLED, ReferencesImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findByreferencesName",
			new String[] { String.class.getName() },
			ReferencesModelImpl.REFERENCESNAME_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_REFERENCESNAME = new FinderPath(ReferencesModelImpl.ENTITY_CACHE_ENABLED,
			ReferencesModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByreferencesName",
			new String[] { String.class.getName() });
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_ALL = new FinderPath(ReferencesModelImpl.ENTITY_CACHE_ENABLED,
			ReferencesModelImpl.FINDER_CACHE_ENABLED, ReferencesImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL = new FinderPath(ReferencesModelImpl.ENTITY_CACHE_ENABLED,
			ReferencesModelImpl.FINDER_CACHE_ENABLED, ReferencesImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_COUNT_ALL = new FinderPath(ReferencesModelImpl.ENTITY_CACHE_ENABLED,
			ReferencesModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countAll", new String[0]);

	/**
	 * Caches the references in the entity cache if it is enabled.
	 *
	 * @param references the references
	 */
	public void cacheResult(References references) {
		EntityCacheUtil.putResult(ReferencesModelImpl.ENTITY_CACHE_ENABLED,
			ReferencesImpl.class, references.getPrimaryKey(), references);

		references.resetOriginalValues();
	}

	/**
	 * Caches the referenceses in the entity cache if it is enabled.
	 *
	 * @param referenceses the referenceses
	 */
	public void cacheResult(List<References> referenceses) {
		for (References references : referenceses) {
			if (EntityCacheUtil.getResult(
						ReferencesModelImpl.ENTITY_CACHE_ENABLED,
						ReferencesImpl.class, references.getPrimaryKey()) == null) {
				cacheResult(references);
			}
			else {
				references.resetOriginalValues();
			}
		}
	}

	/**
	 * Clears the cache for all referenceses.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		if (_HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE) {
			CacheRegistryUtil.clear(ReferencesImpl.class.getName());
		}

		EntityCacheUtil.clearCache(ReferencesImpl.class.getName());

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_ENTITY);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	/**
	 * Clears the cache for the references.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(References references) {
		EntityCacheUtil.removeResult(ReferencesModelImpl.ENTITY_CACHE_ENABLED,
			ReferencesImpl.class, references.getPrimaryKey());

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	@Override
	public void clearCache(List<References> referenceses) {
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		for (References references : referenceses) {
			EntityCacheUtil.removeResult(ReferencesModelImpl.ENTITY_CACHE_ENABLED,
				ReferencesImpl.class, references.getPrimaryKey());
		}
	}

	/**
	 * Creates a new references with the primary key. Does not add the references to the database.
	 *
	 * @param referencesId the primary key for the new references
	 * @return the new references
	 */
	public References create(long referencesId) {
		References references = new ReferencesImpl();

		references.setNew(true);
		references.setPrimaryKey(referencesId);

		return references;
	}

	/**
	 * Removes the references with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param referencesId the primary key of the references
	 * @return the references that was removed
	 * @throws com.virtusa.icd.service.builder.NoSuchReferencesException if a references with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public References remove(long referencesId)
		throws NoSuchReferencesException, SystemException {
		return remove(Long.valueOf(referencesId));
	}

	/**
	 * Removes the references with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the references
	 * @return the references that was removed
	 * @throws com.virtusa.icd.service.builder.NoSuchReferencesException if a references with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public References remove(Serializable primaryKey)
		throws NoSuchReferencesException, SystemException {
		Session session = null;

		try {
			session = openSession();

			References references = (References)session.get(ReferencesImpl.class,
					primaryKey);

			if (references == null) {
				if (_log.isWarnEnabled()) {
					_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchReferencesException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
					primaryKey);
			}

			return remove(references);
		}
		catch (NoSuchReferencesException nsee) {
			throw nsee;
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}
	}

	@Override
	protected References removeImpl(References references)
		throws SystemException {
		references = toUnwrappedModel(references);

		Session session = null;

		try {
			session = openSession();

			BatchSessionUtil.delete(session, references);
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		clearCache(references);

		return references;
	}

	@Override
	public References updateImpl(
		com.virtusa.icd.service.builder.model.References references,
		boolean merge) throws SystemException {
		references = toUnwrappedModel(references);

		boolean isNew = references.isNew();

		ReferencesModelImpl referencesModelImpl = (ReferencesModelImpl)references;

		Session session = null;

		try {
			session = openSession();

			BatchSessionUtil.update(session, references, merge);

			references.setNew(false);
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);

		if (isNew || !ReferencesModelImpl.COLUMN_BITMASK_ENABLED) {
			FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
		}

		else {
			if ((referencesModelImpl.getColumnBitmask() &
					FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_REFERENCESNAME.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						referencesModelImpl.getOriginalReferencesName()
					};

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_REFERENCESNAME,
					args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_REFERENCESNAME,
					args);

				args = new Object[] { referencesModelImpl.getReferencesName() };

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_REFERENCESNAME,
					args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_REFERENCESNAME,
					args);
			}
		}

		EntityCacheUtil.putResult(ReferencesModelImpl.ENTITY_CACHE_ENABLED,
			ReferencesImpl.class, references.getPrimaryKey(), references);

		return references;
	}

	protected References toUnwrappedModel(References references) {
		if (references instanceof ReferencesImpl) {
			return references;
		}

		ReferencesImpl referencesImpl = new ReferencesImpl();

		referencesImpl.setNew(references.isNew());
		referencesImpl.setPrimaryKey(references.getPrimaryKey());

		referencesImpl.setReferencesId(references.getReferencesId());
		referencesImpl.setGroupId(references.getGroupId());
		referencesImpl.setCompanyId(references.getCompanyId());
		referencesImpl.setUserId(references.getUserId());
		referencesImpl.setUserName(references.getUserName());
		referencesImpl.setCreateDate(references.getCreateDate());
		referencesImpl.setModifiedDate(references.getModifiedDate());
		referencesImpl.setReferencesName(references.getReferencesName());
		referencesImpl.setKey(references.getKey());
		referencesImpl.setValue(references.getValue());
		referencesImpl.setActive(references.getActive());
		referencesImpl.setOrder(references.getOrder());

		return referencesImpl;
	}

	/**
	 * Returns the references with the primary key or throws a {@link com.liferay.portal.NoSuchModelException} if it could not be found.
	 *
	 * @param primaryKey the primary key of the references
	 * @return the references
	 * @throws com.liferay.portal.NoSuchModelException if a references with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public References findByPrimaryKey(Serializable primaryKey)
		throws NoSuchModelException, SystemException {
		return findByPrimaryKey(((Long)primaryKey).longValue());
	}

	/**
	 * Returns the references with the primary key or throws a {@link com.virtusa.icd.service.builder.NoSuchReferencesException} if it could not be found.
	 *
	 * @param referencesId the primary key of the references
	 * @return the references
	 * @throws com.virtusa.icd.service.builder.NoSuchReferencesException if a references with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public References findByPrimaryKey(long referencesId)
		throws NoSuchReferencesException, SystemException {
		References references = fetchByPrimaryKey(referencesId);

		if (references == null) {
			if (_log.isWarnEnabled()) {
				_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + referencesId);
			}

			throw new NoSuchReferencesException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
				referencesId);
		}

		return references;
	}

	/**
	 * Returns the references with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the references
	 * @return the references, or <code>null</code> if a references with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public References fetchByPrimaryKey(Serializable primaryKey)
		throws SystemException {
		return fetchByPrimaryKey(((Long)primaryKey).longValue());
	}

	/**
	 * Returns the references with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param referencesId the primary key of the references
	 * @return the references, or <code>null</code> if a references with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public References fetchByPrimaryKey(long referencesId)
		throws SystemException {
		References references = (References)EntityCacheUtil.getResult(ReferencesModelImpl.ENTITY_CACHE_ENABLED,
				ReferencesImpl.class, referencesId);

		if (references == _nullReferences) {
			return null;
		}

		if (references == null) {
			Session session = null;

			boolean hasException = false;

			try {
				session = openSession();

				references = (References)session.get(ReferencesImpl.class,
						Long.valueOf(referencesId));
			}
			catch (Exception e) {
				hasException = true;

				throw processException(e);
			}
			finally {
				if (references != null) {
					cacheResult(references);
				}
				else if (!hasException) {
					EntityCacheUtil.putResult(ReferencesModelImpl.ENTITY_CACHE_ENABLED,
						ReferencesImpl.class, referencesId, _nullReferences);
				}

				closeSession(session);
			}
		}

		return references;
	}

	/**
	 * Returns all the referenceses where referencesName = &#63;.
	 *
	 * @param referencesName the references name
	 * @return the matching referenceses
	 * @throws SystemException if a system exception occurred
	 */
	public List<References> findByreferencesName(String referencesName)
		throws SystemException {
		return findByreferencesName(referencesName, QueryUtil.ALL_POS,
			QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the referenceses where referencesName = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param referencesName the references name
	 * @param start the lower bound of the range of referenceses
	 * @param end the upper bound of the range of referenceses (not inclusive)
	 * @return the range of matching referenceses
	 * @throws SystemException if a system exception occurred
	 */
	public List<References> findByreferencesName(String referencesName,
		int start, int end) throws SystemException {
		return findByreferencesName(referencesName, start, end, null);
	}

	/**
	 * Returns an ordered range of all the referenceses where referencesName = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param referencesName the references name
	 * @param start the lower bound of the range of referenceses
	 * @param end the upper bound of the range of referenceses (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching referenceses
	 * @throws SystemException if a system exception occurred
	 */
	public List<References> findByreferencesName(String referencesName,
		int start, int end, OrderByComparator orderByComparator)
		throws SystemException {
		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
				(orderByComparator == null)) {
			finderPath = FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_REFERENCESNAME;
			finderArgs = new Object[] { referencesName };
		}
		else {
			finderPath = FINDER_PATH_WITH_PAGINATION_FIND_BY_REFERENCESNAME;
			finderArgs = new Object[] {
					referencesName,
					
					start, end, orderByComparator
				};
		}

		List<References> list = (List<References>)FinderCacheUtil.getResult(finderPath,
				finderArgs, this);

		if ((list != null) && !list.isEmpty()) {
			for (References references : list) {
				if (!Validator.equals(referencesName,
							references.getReferencesName())) {
					list = null;

					break;
				}
			}
		}

		if (list == null) {
			StringBundler query = null;

			if (orderByComparator != null) {
				query = new StringBundler(3 +
						(orderByComparator.getOrderByFields().length * 3));
			}
			else {
				query = new StringBundler(2);
			}

			query.append(_SQL_SELECT_REFERENCES_WHERE);

			if (referencesName == null) {
				query.append(_FINDER_COLUMN_REFERENCESNAME_REFERENCESNAME_1);
			}
			else {
				if (referencesName.equals(StringPool.BLANK)) {
					query.append(_FINDER_COLUMN_REFERENCESNAME_REFERENCESNAME_3);
				}
				else {
					query.append(_FINDER_COLUMN_REFERENCESNAME_REFERENCESNAME_2);
				}
			}

			if (orderByComparator != null) {
				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				if (referencesName != null) {
					qPos.add(referencesName);
				}

				list = (List<References>)QueryUtil.list(q, getDialect(), start,
						end);
			}
			catch (Exception e) {
				throw processException(e);
			}
			finally {
				if (list == null) {
					FinderCacheUtil.removeResult(finderPath, finderArgs);
				}
				else {
					cacheResult(list);

					FinderCacheUtil.putResult(finderPath, finderArgs, list);
				}

				closeSession(session);
			}
		}

		return list;
	}

	/**
	 * Returns the first references in the ordered set where referencesName = &#63;.
	 *
	 * @param referencesName the references name
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching references
	 * @throws com.virtusa.icd.service.builder.NoSuchReferencesException if a matching references could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public References findByreferencesName_First(String referencesName,
		OrderByComparator orderByComparator)
		throws NoSuchReferencesException, SystemException {
		References references = fetchByreferencesName_First(referencesName,
				orderByComparator);

		if (references != null) {
			return references;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("referencesName=");
		msg.append(referencesName);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchReferencesException(msg.toString());
	}

	/**
	 * Returns the first references in the ordered set where referencesName = &#63;.
	 *
	 * @param referencesName the references name
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching references, or <code>null</code> if a matching references could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public References fetchByreferencesName_First(String referencesName,
		OrderByComparator orderByComparator) throws SystemException {
		List<References> list = findByreferencesName(referencesName, 0, 1,
				orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last references in the ordered set where referencesName = &#63;.
	 *
	 * @param referencesName the references name
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching references
	 * @throws com.virtusa.icd.service.builder.NoSuchReferencesException if a matching references could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public References findByreferencesName_Last(String referencesName,
		OrderByComparator orderByComparator)
		throws NoSuchReferencesException, SystemException {
		References references = fetchByreferencesName_Last(referencesName,
				orderByComparator);

		if (references != null) {
			return references;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("referencesName=");
		msg.append(referencesName);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchReferencesException(msg.toString());
	}

	/**
	 * Returns the last references in the ordered set where referencesName = &#63;.
	 *
	 * @param referencesName the references name
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching references, or <code>null</code> if a matching references could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public References fetchByreferencesName_Last(String referencesName,
		OrderByComparator orderByComparator) throws SystemException {
		int count = countByreferencesName(referencesName);

		List<References> list = findByreferencesName(referencesName, count - 1,
				count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the referenceses before and after the current references in the ordered set where referencesName = &#63;.
	 *
	 * @param referencesId the primary key of the current references
	 * @param referencesName the references name
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next references
	 * @throws com.virtusa.icd.service.builder.NoSuchReferencesException if a references with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public References[] findByreferencesName_PrevAndNext(long referencesId,
		String referencesName, OrderByComparator orderByComparator)
		throws NoSuchReferencesException, SystemException {
		References references = findByPrimaryKey(referencesId);

		Session session = null;

		try {
			session = openSession();

			References[] array = new ReferencesImpl[3];

			array[0] = getByreferencesName_PrevAndNext(session, references,
					referencesName, orderByComparator, true);

			array[1] = references;

			array[2] = getByreferencesName_PrevAndNext(session, references,
					referencesName, orderByComparator, false);

			return array;
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}
	}

	protected References getByreferencesName_PrevAndNext(Session session,
		References references, String referencesName,
		OrderByComparator orderByComparator, boolean previous) {
		StringBundler query = null;

		if (orderByComparator != null) {
			query = new StringBundler(6 +
					(orderByComparator.getOrderByFields().length * 6));
		}
		else {
			query = new StringBundler(3);
		}

		query.append(_SQL_SELECT_REFERENCES_WHERE);

		if (referencesName == null) {
			query.append(_FINDER_COLUMN_REFERENCESNAME_REFERENCESNAME_1);
		}
		else {
			if (referencesName.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_REFERENCESNAME_REFERENCESNAME_3);
			}
			else {
				query.append(_FINDER_COLUMN_REFERENCESNAME_REFERENCESNAME_2);
			}
		}

		if (orderByComparator != null) {
			String[] orderByConditionFields = orderByComparator.getOrderByConditionFields();

			if (orderByConditionFields.length > 0) {
				query.append(WHERE_AND);
			}

			for (int i = 0; i < orderByConditionFields.length; i++) {
				query.append(_ORDER_BY_ENTITY_ALIAS);
				query.append(orderByConditionFields[i]);

				if ((i + 1) < orderByConditionFields.length) {
					if (orderByComparator.isAscending() ^ previous) {
						query.append(WHERE_GREATER_THAN_HAS_NEXT);
					}
					else {
						query.append(WHERE_LESSER_THAN_HAS_NEXT);
					}
				}
				else {
					if (orderByComparator.isAscending() ^ previous) {
						query.append(WHERE_GREATER_THAN);
					}
					else {
						query.append(WHERE_LESSER_THAN);
					}
				}
			}

			query.append(ORDER_BY_CLAUSE);

			String[] orderByFields = orderByComparator.getOrderByFields();

			for (int i = 0; i < orderByFields.length; i++) {
				query.append(_ORDER_BY_ENTITY_ALIAS);
				query.append(orderByFields[i]);

				if ((i + 1) < orderByFields.length) {
					if (orderByComparator.isAscending() ^ previous) {
						query.append(ORDER_BY_ASC_HAS_NEXT);
					}
					else {
						query.append(ORDER_BY_DESC_HAS_NEXT);
					}
				}
				else {
					if (orderByComparator.isAscending() ^ previous) {
						query.append(ORDER_BY_ASC);
					}
					else {
						query.append(ORDER_BY_DESC);
					}
				}
			}
		}

		String sql = query.toString();

		Query q = session.createQuery(sql);

		q.setFirstResult(0);
		q.setMaxResults(2);

		QueryPos qPos = QueryPos.getInstance(q);

		if (referencesName != null) {
			qPos.add(referencesName);
		}

		if (orderByComparator != null) {
			Object[] values = orderByComparator.getOrderByConditionValues(references);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<References> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Returns all the referenceses.
	 *
	 * @return the referenceses
	 * @throws SystemException if a system exception occurred
	 */
	public List<References> findAll() throws SystemException {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the referenceses.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param start the lower bound of the range of referenceses
	 * @param end the upper bound of the range of referenceses (not inclusive)
	 * @return the range of referenceses
	 * @throws SystemException if a system exception occurred
	 */
	public List<References> findAll(int start, int end)
		throws SystemException {
		return findAll(start, end, null);
	}

	/**
	 * Returns an ordered range of all the referenceses.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param start the lower bound of the range of referenceses
	 * @param end the upper bound of the range of referenceses (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of referenceses
	 * @throws SystemException if a system exception occurred
	 */
	public List<References> findAll(int start, int end,
		OrderByComparator orderByComparator) throws SystemException {
		FinderPath finderPath = null;
		Object[] finderArgs = new Object[] { start, end, orderByComparator };

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
				(orderByComparator == null)) {
			finderPath = FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL;
			finderArgs = FINDER_ARGS_EMPTY;
		}
		else {
			finderPath = FINDER_PATH_WITH_PAGINATION_FIND_ALL;
			finderArgs = new Object[] { start, end, orderByComparator };
		}

		List<References> list = (List<References>)FinderCacheUtil.getResult(finderPath,
				finderArgs, this);

		if (list == null) {
			StringBundler query = null;
			String sql = null;

			if (orderByComparator != null) {
				query = new StringBundler(2 +
						(orderByComparator.getOrderByFields().length * 3));

				query.append(_SQL_SELECT_REFERENCES);

				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);

				sql = query.toString();
			}
			else {
				sql = _SQL_SELECT_REFERENCES;
			}

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				if (orderByComparator == null) {
					list = (List<References>)QueryUtil.list(q, getDialect(),
							start, end, false);

					Collections.sort(list);
				}
				else {
					list = (List<References>)QueryUtil.list(q, getDialect(),
							start, end);
				}
			}
			catch (Exception e) {
				throw processException(e);
			}
			finally {
				if (list == null) {
					FinderCacheUtil.removeResult(finderPath, finderArgs);
				}
				else {
					cacheResult(list);

					FinderCacheUtil.putResult(finderPath, finderArgs, list);
				}

				closeSession(session);
			}
		}

		return list;
	}

	/**
	 * Removes all the referenceses where referencesName = &#63; from the database.
	 *
	 * @param referencesName the references name
	 * @throws SystemException if a system exception occurred
	 */
	public void removeByreferencesName(String referencesName)
		throws SystemException {
		for (References references : findByreferencesName(referencesName)) {
			remove(references);
		}
	}

	/**
	 * Removes all the referenceses from the database.
	 *
	 * @throws SystemException if a system exception occurred
	 */
	public void removeAll() throws SystemException {
		for (References references : findAll()) {
			remove(references);
		}
	}

	/**
	 * Returns the number of referenceses where referencesName = &#63;.
	 *
	 * @param referencesName the references name
	 * @return the number of matching referenceses
	 * @throws SystemException if a system exception occurred
	 */
	public int countByreferencesName(String referencesName)
		throws SystemException {
		Object[] finderArgs = new Object[] { referencesName };

		Long count = (Long)FinderCacheUtil.getResult(FINDER_PATH_COUNT_BY_REFERENCESNAME,
				finderArgs, this);

		if (count == null) {
			StringBundler query = new StringBundler(2);

			query.append(_SQL_COUNT_REFERENCES_WHERE);

			if (referencesName == null) {
				query.append(_FINDER_COLUMN_REFERENCESNAME_REFERENCESNAME_1);
			}
			else {
				if (referencesName.equals(StringPool.BLANK)) {
					query.append(_FINDER_COLUMN_REFERENCESNAME_REFERENCESNAME_3);
				}
				else {
					query.append(_FINDER_COLUMN_REFERENCESNAME_REFERENCESNAME_2);
				}
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				if (referencesName != null) {
					qPos.add(referencesName);
				}

				count = (Long)q.uniqueResult();
			}
			catch (Exception e) {
				throw processException(e);
			}
			finally {
				if (count == null) {
					count = Long.valueOf(0);
				}

				FinderCacheUtil.putResult(FINDER_PATH_COUNT_BY_REFERENCESNAME,
					finderArgs, count);

				closeSession(session);
			}
		}

		return count.intValue();
	}

	/**
	 * Returns the number of referenceses.
	 *
	 * @return the number of referenceses
	 * @throws SystemException if a system exception occurred
	 */
	public int countAll() throws SystemException {
		Long count = (Long)FinderCacheUtil.getResult(FINDER_PATH_COUNT_ALL,
				FINDER_ARGS_EMPTY, this);

		if (count == null) {
			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(_SQL_COUNT_REFERENCES);

				count = (Long)q.uniqueResult();
			}
			catch (Exception e) {
				throw processException(e);
			}
			finally {
				if (count == null) {
					count = Long.valueOf(0);
				}

				FinderCacheUtil.putResult(FINDER_PATH_COUNT_ALL,
					FINDER_ARGS_EMPTY, count);

				closeSession(session);
			}
		}

		return count.intValue();
	}

	/**
	 * Initializes the references persistence.
	 */
	public void afterPropertiesSet() {
		String[] listenerClassNames = StringUtil.split(GetterUtil.getString(
					com.liferay.util.service.ServiceProps.get(
						"value.object.listener.com.virtusa.icd.service.builder.model.References")));

		if (listenerClassNames.length > 0) {
			try {
				List<ModelListener<References>> listenersList = new ArrayList<ModelListener<References>>();

				for (String listenerClassName : listenerClassNames) {
					listenersList.add((ModelListener<References>)InstanceFactory.newInstance(
							listenerClassName));
				}

				listeners = listenersList.toArray(new ModelListener[listenersList.size()]);
			}
			catch (Exception e) {
				_log.error(e);
			}
		}
	}

	public void destroy() {
		EntityCacheUtil.removeCache(ReferencesImpl.class.getName());
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_ENTITY);
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	@BeanReference(type = EnrollmentPersistence.class)
	protected EnrollmentPersistence enrollmentPersistence;
	@BeanReference(type = MedicalRecordPersistence.class)
	protected MedicalRecordPersistence medicalRecordPersistence;
	@BeanReference(type = ReferencesPersistence.class)
	protected ReferencesPersistence referencesPersistence;
	@BeanReference(type = ResourcePersistence.class)
	protected ResourcePersistence resourcePersistence;
	@BeanReference(type = UserPersistence.class)
	protected UserPersistence userPersistence;
	private static final String _SQL_SELECT_REFERENCES = "SELECT references FROM References references";
	private static final String _SQL_SELECT_REFERENCES_WHERE = "SELECT references FROM References references WHERE ";
	private static final String _SQL_COUNT_REFERENCES = "SELECT COUNT(references) FROM References references";
	private static final String _SQL_COUNT_REFERENCES_WHERE = "SELECT COUNT(references) FROM References references WHERE ";
	private static final String _FINDER_COLUMN_REFERENCESNAME_REFERENCESNAME_1 = "references.referencesName IS NULL";
	private static final String _FINDER_COLUMN_REFERENCESNAME_REFERENCESNAME_2 = "references.referencesName = ?";
	private static final String _FINDER_COLUMN_REFERENCESNAME_REFERENCESNAME_3 = "(references.referencesName IS NULL OR references.referencesName = ?)";
	private static final String _ORDER_BY_ENTITY_ALIAS = "references.";
	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY = "No References exists with the primary key ";
	private static final String _NO_SUCH_ENTITY_WITH_KEY = "No References exists with the key {";
	private static final boolean _HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE = GetterUtil.getBoolean(PropsUtil.get(
				PropsKeys.HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE));
	private static Log _log = LogFactoryUtil.getLog(ReferencesPersistenceImpl.class);
	private static References _nullReferences = new ReferencesImpl() {
			@Override
			public Object clone() {
				return this;
			}

			@Override
			public CacheModel<References> toCacheModel() {
				return _nullReferencesCacheModel;
			}
		};

	private static CacheModel<References> _nullReferencesCacheModel = new CacheModel<References>() {
			public References toEntityModel() {
				return _nullReferences;
			}
		};
}