<%@ page import="web.webap.*" %>
<html>
<!--
01243B	5288DB	9DA7B2	C5C5C5	71C42B	F2F39E
-->

<head>
<script src="jquery-2.1.4.min.js"></script>
<style>

body {
	font-family: Lato, sans-serif;
	margin: 0px; 
	margin-right: 0px;
	top: 0px; 
	padding: 0px; 

}

table {
    border-collapse: collapse;
}

table, th, td {
    border: 1px solid black;
    height: 100%;
}

table tr td > div {
	padding: 1em 1em 1em 1em;
}

a {
	color: #FFFFFF;
}
a:link {
    color: white;
    text-decoration: none;
}

a:visited {
	color: white;
    text-decoration: none;
}
a:hover {
	color: white;
    text-decoration: underline;
}
a:active {
	color: white;
    text-decoration: none;
}

.bg-color-container {
	position: absolute;
	width: 100%; 
	box-shadow: 1px 2px 3px #555555;
/*	padding-left: 0em; 
  	padding-right: 0em; */
   	padding-bottom: 1em; 
   	padding-top: 1em;
}

/* black */
.bg-black-nav  {
	background-color:black; 
	
/*	padding-left: 1em; 
   	padding-right: 1em; */
   	padding-bottom: 0.3em; 
   	padding-top: 1.2em;
}

/*
.bg-color0 {
	height:0em; 
	background-color:#01243B;  
	-ms-filter: "progid:DXImageTransform.Microsoft.Alpha(Opacity=100)";
    filter: alpha(opacity=100);
   	opacity: 1;
}
*/

/* blue */
.bg-blue-container-div {
	height: 18em; 
	top: 30em;
	background-color:#5288DB;
	-ms-filter: "progid:DXImageTransform.Microsoft.Alpha(Opacity=70)";
    filter: alpha(opacity=70);
   	opacity: .7;
}

/* gray */
.bg-gray-container-div {
	height: 18em;  
	top: 50em;
	background-color:#9DA7B2;
	-ms-filter: "progid:DXImageTransform.Microsoft.Alpha(Opacity=50)";
    filter: alpha(opacity=50);
   	opacity: .5;
}

/* green */
.bg-color4 {
	height: 18em; 
	top: 70em;
	background-color:#71C42B;
	-ms-filter: "progid:DXImageTransform.Microsoft.Alpha(Opacity=50)";
    filter: alpha(opacity=50);
   	opacity: .5;
}


/* yellow */
.bg-color5 {
	height: 18em;  
	top: 90em;
	background-color:#F2F39E;
	-ms-filter: "progid:DXImageTransform.Microsoft.Alpha(Opacity=50)";
    filter: alpha(opacity=50);
   	opacity: .5;
}


/* light gray */
.bg-color3 {
	height:18em;  
	top: 110em;
	background-color:#C5C5C5;
	-ms-filter: "progid:DXImageTransform.Microsoft.Alpha(Opacity=50)";
    filter: alpha(opacity=50);
   	opacity: .5;
}

@media screen and (max-width: 600px) {
    body {
        background-color: black;
    }
}

</style>
<script type="text/javascript" >
$(document).ready(function() {

    $('#go-link').on('click', function() {
    	$("#url-widget-div").hide();
    	$("#spinner-widget-div").show();
   
		$.getJSON( "/webapp-0.0.1/test", { name: "John", time: "2pm" } )
  			.done(function( json ) {

			$("#url-response-widget-div").show();
    		$("#spinner-widget-div").hide();
  		})
  		.fail(function( jqxhr, textStatus, error ) {
    		// var err = textStatus + ", " + error;
    		
    		$("#url-response-widget-div").show();
    		$("#spinner-widget-div").hide();
		});
    });
    
    
    
    
    
});
	
</script>
</head>
<body>
<nav class=" bg-color-container bg-black-nav">    
     <!-- div style="position: relative; width: 100%; height: 100%;" --> <!-- /div -->  
    

  	<div style="display: inline-block; align: left; width: 50%; ">
  		<a style="font-size: 1.4em; padding-left: 1em; padding-right: 1em;" href="#">Home</a>
  		<a style="font-size: 1.4em; padding-left: 1em; padding-right: 1em;" href="#">Features</a>
  		<a style="font-size: 1.4em; padding-left: 1em; padding-right: 1em;" href="#">Configure</a>
  	</div>
  			
  	<div style="display: inline-block; align: right; width: 45%; text-align: right; font-size: 0.9em; ;">
  		<a style="font-size: 0.9em; padding-left: 1em; padding-right: 1em;" href="/site/login.jsp">Login</a>
  		<a style="font-size: 0.9em; padding-left: 1em; padding-right: 1em;" href="#">Signup</a>
  	</div>   
</nav>

<div id="main" style="position: absolute; width: 100%; top: 4em;" align="center">

	<div id="spinner-widget-div" style="display: none; position: relative; top: 10.5em;">
		<img src="spinner.gif" alt="Loading ..." />
	</div>
	
	<div id="url-widget-div" style="top: 1.5em; position: relative; padding: 1.5em 1.5em 1.5em 1.5em; width: 30em; height: 20em;; box-shadow: 1px 2px 3px #555555;">
			<label for="url-input">Enter URL</label>
			<input name="url-input" maxlength="40" size="40"></input>
			<a href="#" style="color: black;" id="go-link">Go</a>
	</div>
	
	<div id="url-response-widget-div" style="display: none; top: 1.5em; position: relative; padding: 1.5em 1.5em 1.5em 1.5em; width: 30em; height: 20em;; box-shadow: 1px 2px 3px #555555;">
			<p>Your request has been completed!</p>
	</div>

</div>

<div class="bg-blue-container-div bg-color-container" align="center">

<table width="96%" border="1">
<tr>
	<td width="24%">
		<div>
	 What
		</div>
	</td>
	<td width="24%">
	<div>
	<%
GetSomeValue gsv = new GetSomeValue();
String someValue = gsv.getSomeValue();
    // This is a scriptlet.  Notice that the "date"
    // variable we declare here is available in the
    // embedded expression later on.
    System.out.println( "Evaluating date now" );
    java.util.Date date = new java.util.Date();
%>
Hello! fcc<%= someValue %> The time is now <%= date %>
</div>
	</td>
	<td width="24%">
		<div>
	 What
		</div>	
	</td>
	<td width="24%">
			<div>
	 What
		</div>
	</td>
</tr>
</table>

</div>



<!--
<div class="bg-gray-container-div bg-color-container" align="center">
      
<table width="96%" border="1">
<tr>
	<td width="24%">
		<div>
	 What
		</div>
	</td>
	<td width="24%">
			<div>
	 What
		</div>
	</td>
	<td width="24%">
			<div>
	 What
		</div>
	</td>
	<td width="24%">
			<div>
	 What
		</div>
	</td>
</tr>
</table>
</div>


 
<div class="bg-color4 bg-color-container" align="center">
      
      
<table width="96%" border="1">
<tr>
	<td width="24%">
		<div>
	 What
		</div>
	</td>
	<td width="24%">
	<div>
      What
      
      
<%

    double num = Math.random();
    if (num > 0.95) {
%>
      <h2>You'll have a luck day!</h2><p>(<%= num %>)</p>
<%
    } else {
%>
      <h2>Well, life goes on ... </h2><p>(<%= num %>)</p>
<%
    }
%>
<a href="<%= request.getRequestURI() %>"><h3>Try Again</h3></a>

	</div>
	</td>
	<td width="24%">
		<div>
	 What
		</div>	
	</td>
	<td width="24%">
			<div>
	 What
		</div>
	</td>
</tr>
</table>

      

  
  
</div>

<div class="bg-color5 bg-color-container" align="center">
      
<table width="96%" border="1">
<tr>
	<td width="24%">
		<div>
	 What
		</div>
	</td>
	<td width="24%">
			<div>
	 What
		</div>
	</td>
	<td width="24%">
			<div>
	 What
		</div>
	</td>
	<td width="24%">
			<div>
	 What
		</div>
	</td>
</tr>
</table>

</div>

<footer class="bg-color3 bg-color-container" align="center">
      
<table width="96%" border="1">
<tr>
	<td width="24%">
		<div>
	 What
		</div>
	</td>
	<td width="24%">
			<div>
	 What
		</div>
	</td>
	<td width="24%">
			<div>
	 What
		</div>
	</td>
	<td width="24%">
			<div>
	 What
		</div>
	</td>
</tr>
</table>
</footer>

-->

</body>
</html>