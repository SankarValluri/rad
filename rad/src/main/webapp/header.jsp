<%@ taglib prefix="s" uri="/struts-tags" %>
<%@ page session="false"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<%@ taglib prefix="sj" uri="/struts-jquery-tags"%>

<s:url forceAddSchemeHostAndPort="true" includeParams="all" var="originalRequest" encode="false" escapeAmp="false"/>
<script type="text/javascript">
    $( document ).ready(function() {

    });
</script>
<div id="pageHeader">
    <s:a id="heander-brand" action="welcomeAction">
        <img class="header-tree" src="web/images/rad.jpg">
    </s:a>
    <span class="header-link-wrapper">
    	Research And Development
    </span>
</div>