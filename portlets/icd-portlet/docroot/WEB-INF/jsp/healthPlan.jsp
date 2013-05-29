<!DOCTYPE HTML>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=iso-8859-1">
<title>Healthplan Page</title>
<link href="css/main.css" rel="stylesheet" type="text/css">
</head>
<body>
<div id="banner">
  <div id="menubar">
    <div class="menubarwraper">
      <ul>
        <li><a href="Home.html">Home</a></li>
        <li><a href="Enrollment.html">Enrollment</a></li>
        <li><a href="Document.html">Document</a></li>
        <li><a href="Report.html">Report</a></li>
        <li><a href="Support.html">Support</a></li>
        <li><a href="Dashboard.html">Dashboard</a></li>
        <li><a href="PMO.html">PMO</a></li>
      </ul>
    </div>
  </div>
</div>
<div id="page_container">
  <h1>Healthplan Page</h1>
  <div class="section">
   
    <div class="ex_medium_col">
    <div><label>Testing Progress Meter vs Time Remaining Meter</label></div>
    <div class="pt_wrapper">
    <div class="progress">50%</div> 
      <div class="timer">1.5hr</div> 
      </div>

      <div class="small_col margin_left_non_r10">
     <input type="file" name="file" class="file_field marginbottom_10" size="15">&nbsp;     <label>Select EDI Files</label>
     <input type="button" value="Upload 5010/ICD-9 Files for Conversion" class="button marginbottom_10" onClick="">
     <input type="button" value="Bulk Upload .csv File" class="button marginbottom_10" onClick="">
     <input type="button" value="View 5010/ICD-10 Test Data for Adjudication" class="button marginbottom_10" onClick="">
     <input type="button" value="Initiate Queue SFTP File Transer" class="button marginbottom_10" onClick="">
     <select name="selectMedicalRecordID" class="select_box">
        <option>Select Medical Record ID#</option>
        <option>opt2</option>
        <option>opt3</option>
      </select>
      <input type="button" value="Download 5010/ICD-10 EDI Files" class="button marginbottom_10" onClick="">
     <input type="button" value="Bulk Download of 5010/ICD-10 Data" class="button marginbottom_10" onClick="">
    </div>
    <div class="small_col">
     <select name="selectMedicalRecordID" class="select_box">
        <option>Select Medical Record ID#</option>
        <option>opt2</option>
        <option>opt3</option>
      </select>
      <input type="button" value="Download Dual Coding Worksheet" class="button marginbottom_10" onClick="">
      <input type="button" value="Download Medical Record" class="button marginbottom_10" onClick="">
      <input type="button" value="Report ICD-10 Coding Issue" class="button marginbottom_10" onClick="">
      <select name="selectMedicalRecordID" class="select_box">
        <option>Select Medical Record ID#</option>
        <option>opt2</option>
        <option>opt3</option>
      </select>
        <input type="button" value="Upload Remittance File" class="button marginbottom_10" onClick="">
      <input type="button" value="Approve Remittance" class="button marginbottom_10" onClick="">
      <input type="button" value="Download Remittance File" class="button marginbottom_10" onClick="">
    </div>
    </div>
    

    <div class="small_col"></div>
    <div class="small_col">
     
   <img src="images/feed.png" width="296" height="271" />
   <div class="subheader"><h3>Testing Events Calendar</h3></div>
    <img src="images/calendar.png" width="296" height="271" />
    </div>
  </div>
  
   <div class="h_line"></div>
  <div class="section">
    <div class="large_col">
      <div class="button_wrapper">
       
        <input type="button" value="FAQ" class="btn_right button" onClick="">
        <div class="clearfix"></div>
      </div>
    </div>
  </div>
  <!-- footer -->
  <div class="clearfix"></div>
  <div id="footer"> <span>Copyright 2013 Lott QA Group, Inc. All Rights Reserved Visibiledi is a registered trademark </span> </div>
</div>
</body>
</html>
