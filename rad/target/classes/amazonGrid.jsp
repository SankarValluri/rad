<%@ taglib prefix="s" uri="/struts-tags"%>
<%@ taglib prefix="sj" uri="/struts-jquery-tags"%>
<%@ taglib prefix="sjg" uri="/struts-jquery-grid-tags"%>
<script type="text/javascript">

    /**
     * Creates an HTML snippet for the Image column of a given row.
     */
    function imageFormatter(cellvalue,options,row) {
        if (!row.imageUrl) {
        	return '';
        }	 
        return '<img alt="Image" src="' + row.imageUrl + '" height="60">';
    };
</script>

<div id="gridDiv">
	<s:url var="amazonGridJson" action="amazonGridJson.action?keyword=%{keyword}"/>	
    <sjg:grid id="gridtable" dataType="json" href="%{amazonGridJson}"
              gridModel="amazonList" pager="true" rownumbers="false" 
              rowNum= "20" viewrecords="true" loadonce="true"
              resizable="false" resizableHandles="false"
              altRows="true" altClass="altRows" hidegrid="false" >
        <sjg:gridColumn name="image" index="image" sortable="false"
                        width="95" title="Image"
                        formatter="imageFormatter" />
        <sjg:gridColumn name="name" index="name" sortable="true"  
                        width="242" title="Name"/>
        <sjg:gridColumn name="title" index="title" sortable="true"
                        width="242" title="Description" />            
        <sjg:gridColumn name="formattedPrice" index="formattedPrice" sortable="true" 
                        width="95" title="Price" />  
        <sjg:gridColumn name="asin" index="asin" sortable="false" 
                        width="0" hidden="true" title="ASIN" />  
        <sjg:gridColumn name="priceInCents" index="priceInCents" sortable="false" 
                        width="0" hidden="true" title="Average" />  
	</sjg:grid>
</div>