<%@ page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags" %>
<%@ taglib prefix="sj" uri="/struts-jquery-tags"%>

<script type="text/javascript">
    jQuery(document).ready(function() { 
        var menuItem = '<%= session.getAttribute("menuItem") %>';
        menuItem = menuItem != "null" ? menuItem : "welcomeAction";
        highlightMenuItem(menuItem);        
    });
    function highlightMenuItem(menuItem){
        $('li a').each( function(){
             var href = $(this).attr('href'); 
             if(href.indexOf(menuItem) >= 0 ){
                 var parent = $(this).parent().id;
                 $(this).siblings().addClass('menuCurrentColor');
                 $(this).addClass("menuHighlighter");
                 return false;
             }
        });         
    }   
</script>
<ul>
	<li><s:a action="welcomeAction">HOME</s:a></li>	
	<li><s:a action="amazonAction">Amazon API</s:a></li>
	<li><s:a action="webserviceAction">Webservice</s:a></li>
	<li><s:a action="metadataAction">Metadata</s:a></li>
</ul>