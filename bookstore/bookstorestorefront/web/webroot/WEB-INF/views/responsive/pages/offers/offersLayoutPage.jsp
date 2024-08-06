<%@ page trimDirectiveWhitespaces="true" %>
<%@ taglib prefix="template" tagdir="/WEB-INF/tags/desktop/template" %>
<%@ taglib prefix="cms" uri="http://hybris.com/tld/cmstags" %>
<%@ taglib prefix="common" tagdir="/WEB-INF/tags/desktop/common" %>

<cms:pageSlot position="offersParagraph" var="feature" element="div" class="offersBannerParagraph">
<cms:component component="${feature}" />
</cms:pageSlot>

