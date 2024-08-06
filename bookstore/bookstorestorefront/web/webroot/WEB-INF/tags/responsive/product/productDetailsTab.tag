<%@ tag body-content="empty" trimDirectiveWhitespaces="true"%>
<%@ attribute name="product" required="true" type="de.hybris.platform.commercefacades.product.data.ProductData"%>
<%@ taglib prefix="ycommerce" uri="http://hybris.com/tld/ycommercetags"%>

<div class="tab-details">
	<ycommerce:testId code="productDetails_content_label">
		<p>
			${ycommerce:sanitizeHTML(product.description)}
		
		<br/>ISBN10: ${ycommerce:sanitizeHTML(product.ISBN10)}
		<br/>ISBN13: ${ycommerce:sanitizeHTML(product.ISBN13)}
		<br/>Language: ${ycommerce:sanitizeHTML(product.language)}
		<p>
	</ycommerce:testId>
</div>