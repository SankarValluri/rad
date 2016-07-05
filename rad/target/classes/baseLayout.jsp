<!DOCTYPE html>
<%@ taglib prefix="s" uri="/struts-tags"%>
<%@ taglib prefix="sj" uri="/struts-jquery-tags"%>
<%@ taglib uri="http://tiles.apache.org/tags-tiles" prefix="tiles" %>
<s:url id="imagesRoot" value="/web/images"/>

<html xmlns="http://www.w3.org/1999/xhtml">
    <head>
        <meta http-equiv="X-UA-Compatible" content="IE=8" >
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <meta http-equiv="Cache-Control" content="no-cache, no-store, must-revalidate"/>
        <sj:head jqueryui="true" jquerytheme="cupertino"/>
  
        <title><tiles:insertAttribute name="title" ignore="true" /></title>

        <link rel="stylesheet" type="text/css" href="<s:url value="/web/css/reset.css"/>">
        <link rel="stylesheet" type="text/css" href="<s:url value="/web/css/styles.css"/>">
        <link rel="shortcut icon" href="<s:url value="/web/images/favicon.ico"/>" />
        
	    <script type="text/javascript">
	    
            var shouldValidate = false || "<s:property value='hasActionErrors()'/>" === "true";

			function confirmDialog(){
    			var ret = confirm("Do you want to delete the resource?");
	    		return ret;
		    };
		    
		    function validateRequiredField(field) {
		        if (!shouldValidate) {
		            return;
		        }
		        if (isFieldEmpty(field)) {
		            field.classList.add('invalid');
		        } else {
		            field.classList.remove('invalid');
		        }
		    };

		    function isFieldEmpty(field) {
                var value = field.value || '';
	            return value.trim().length === 0;
		    };

		    function validateRequiredFields() {
		    	var valid = true;
		    	var formFields = document.getElementsByClassName('form-field-required');
		    	for (var i = 0; i < formFields.length; i++) {
		    	  var inputField = formFields[i].children[1].children[0]
		    	  if (isFieldEmpty(inputField)) {
		    	    inputField.classList.add('invalid');
		    	    valid = false;
		    	  }
		    	}
		    	return valid;
		    };
		    
		    function validateEmailAddress(emailField) {
		        if (!shouldValidate) {
		            return true;
		        }

                var regex = /^.+@[^\.].*\.[a-zA-Z0-9]{2,}$/;
		        var valid = regex.test(emailField.value); 

		        if (!valid) {
		            emailField.classList.add('invalid');
		        } else {
		            emailField.classList.remove('invalid');
		        }
		        return valid;
		    };
        </script>
    </head>
    <body id="santas-little-helper">
        <div id="sessionInvalid"></div>
        <tiles:insertAttribute name="header" /> 
        <div id="mainContent">   
            <div id="nav" >
                <tiles:insertAttribute name="menu" />
            </div><!--
            This comment is intentional and necessary; DO NOT REMOVE IT!
            https://css-tricks.com/fighting-the-space-between-inline-block-elements/              
         --><div id="mainContentColumn">
                <s:actionerror cssClass="errorMessage" id="errorMessage"/>
                <div class="sectionHeader">
                	<tiles:insertAttribute name="title" ignore="true" />
                </div>
                <tiles:insertAttribute name="body" />
            </div>       
        </div>
        <div id="pageFooter">
            <tiles:insertAttribute name="footer" />
        </div>
    </body>
</html>