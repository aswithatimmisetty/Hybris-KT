/*
 * ----------------------------------------------------------------
 * --- WARNING: THIS FILE IS GENERATED AND WILL BE OVERWRITTEN! ---
 * --- Generated at Aug 5, 2024, 8:56:48 PM                     ---
 * ----------------------------------------------------------------
 *  
 * Copyright (c) 2024 SAP SE or an SAP affiliate company. All rights reserved.
 */
package de.hybris.cronjob.jalo;

import de.hybris.platform.cronjob.jalo.CronJob;
import de.hybris.platform.jalo.Item.AttributeMode;
import de.hybris.platform.jalo.SessionContext;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import my.bookstore.core.constants.BookstoreCoreConstants;

/**
 * Generated class for type {@link de.hybris.cronjob.jalo.SampleCronJob SampleCronJob}.
 */
@SuppressWarnings({"deprecation","unused","cast"})
public abstract class GeneratedSampleCronJob extends CronJob
{
	/** Qualifier of the <code>SampleCronJob.sampleValue</code> attribute **/
	public static final String SAMPLEVALUE = "sampleValue";
	protected static final Map<String, AttributeMode> DEFAULT_INITIAL_ATTRIBUTES;
	static
	{
		final Map<String, AttributeMode> tmp = new HashMap<String, AttributeMode>(CronJob.DEFAULT_INITIAL_ATTRIBUTES);
		tmp.put(SAMPLEVALUE, AttributeMode.INITIAL);
		DEFAULT_INITIAL_ATTRIBUTES = Collections.unmodifiableMap(tmp);
	}
	@Override
	protected Map<String, AttributeMode> getDefaultAttributeModes()
	{
		return DEFAULT_INITIAL_ATTRIBUTES;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>SampleCronJob.sampleValue</code> attribute.
	 * @return the sampleValue
	 */
	public String getSampleValue(final SessionContext ctx)
	{
		return (String)getProperty( ctx, SAMPLEVALUE);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>SampleCronJob.sampleValue</code> attribute.
	 * @return the sampleValue
	 */
	public String getSampleValue()
	{
		return getSampleValue( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>SampleCronJob.sampleValue</code> attribute. 
	 * @param value the sampleValue
	 */
	public void setSampleValue(final SessionContext ctx, final String value)
	{
		setProperty(ctx, SAMPLEVALUE,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>SampleCronJob.sampleValue</code> attribute. 
	 * @param value the sampleValue
	 */
	public void setSampleValue(final String value)
	{
		setSampleValue( getSession().getSessionContext(), value );
	}
	
}
