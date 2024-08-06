/*
 * ----------------------------------------------------------------
 * --- WARNING: THIS FILE IS GENERATED AND WILL BE OVERWRITTEN! ---
 * --- Generated at Aug 5, 2024, 8:56:48 PM                     ---
 * ----------------------------------------------------------------
 */
package my.bookstore.core.jalo;

import de.hybris.platform.acceleratorcms.jalo.components.SimpleBannerComponent;
import de.hybris.platform.jalo.Item.AttributeMode;
import de.hybris.platform.jalo.JaloInvalidParameterException;
import de.hybris.platform.jalo.SessionContext;
import de.hybris.platform.jalo.c2l.C2LManager;
import de.hybris.platform.jalo.c2l.Language;
import de.hybris.platform.jalo.media.Media;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import my.bookstore.core.constants.BookstoreCoreConstants;

/**
 * Generated class for type {@link de.hybris.platform.acceleratorcms.jalo.components.SimpleBannerComponent BeoingCustomComponent}.
 */
@SuppressWarnings({"deprecation","unused","cast"})
public abstract class GeneratedBeoingCustomComponent extends SimpleBannerComponent
{
	/** Qualifier of the <code>BeoingCustomComponent.boeingImage</code> attribute **/
	public static final String BOEINGIMAGE = "boeingImage";
	/** Qualifier of the <code>BeoingCustomComponent.text</code> attribute **/
	public static final String TEXT = "text";
	/** Qualifier of the <code>BeoingCustomComponent.button</code> attribute **/
	public static final String BUTTON = "button";
	protected static final Map<String, AttributeMode> DEFAULT_INITIAL_ATTRIBUTES;
	static
	{
		final Map<String, AttributeMode> tmp = new HashMap<String, AttributeMode>(SimpleBannerComponent.DEFAULT_INITIAL_ATTRIBUTES);
		tmp.put(BOEINGIMAGE, AttributeMode.INITIAL);
		tmp.put(TEXT, AttributeMode.INITIAL);
		tmp.put(BUTTON, AttributeMode.INITIAL);
		DEFAULT_INITIAL_ATTRIBUTES = Collections.unmodifiableMap(tmp);
	}
	@Override
	protected Map<String, AttributeMode> getDefaultAttributeModes()
	{
		return DEFAULT_INITIAL_ATTRIBUTES;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>BeoingCustomComponent.boeingImage</code> attribute.
	 * @return the boeingImage
	 */
	public Media getBoeingImage(final SessionContext ctx)
	{
		return (Media)getProperty( ctx, BOEINGIMAGE);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>BeoingCustomComponent.boeingImage</code> attribute.
	 * @return the boeingImage
	 */
	public Media getBoeingImage()
	{
		return getBoeingImage( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>BeoingCustomComponent.boeingImage</code> attribute. 
	 * @param value the boeingImage
	 */
	public void setBoeingImage(final SessionContext ctx, final Media value)
	{
		setProperty(ctx, BOEINGIMAGE,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>BeoingCustomComponent.boeingImage</code> attribute. 
	 * @param value the boeingImage
	 */
	public void setBoeingImage(final Media value)
	{
		setBoeingImage( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>BeoingCustomComponent.button</code> attribute.
	 * @return the button
	 */
	public String getButton(final SessionContext ctx)
	{
		if( ctx == null || ctx.getLanguage() == null )
		{
			throw new JaloInvalidParameterException("GeneratedBeoingCustomComponent.getButton requires a session language", 0 );
		}
		return (String)getLocalizedProperty( ctx, BUTTON);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>BeoingCustomComponent.button</code> attribute.
	 * @return the button
	 */
	public String getButton()
	{
		return getButton( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>BeoingCustomComponent.button</code> attribute. 
	 * @return the localized button
	 */
	public Map<Language,String> getAllButton(final SessionContext ctx)
	{
		return (Map<Language,String>)getAllLocalizedProperties(ctx,BUTTON,C2LManager.getInstance().getAllLanguages());
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>BeoingCustomComponent.button</code> attribute. 
	 * @return the localized button
	 */
	public Map<Language,String> getAllButton()
	{
		return getAllButton( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>BeoingCustomComponent.button</code> attribute. 
	 * @param value the button
	 */
	public void setButton(final SessionContext ctx, final String value)
	{
		if ( ctx == null) 
		{
			throw new JaloInvalidParameterException( "ctx is null", 0 );
		}
		if( ctx.getLanguage() == null )
		{
			throw new JaloInvalidParameterException("GeneratedBeoingCustomComponent.setButton requires a session language", 0 );
		}
		setLocalizedProperty(ctx, BUTTON,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>BeoingCustomComponent.button</code> attribute. 
	 * @param value the button
	 */
	public void setButton(final String value)
	{
		setButton( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>BeoingCustomComponent.button</code> attribute. 
	 * @param value the button
	 */
	public void setAllButton(final SessionContext ctx, final Map<Language,String> value)
	{
		setAllLocalizedProperties(ctx,BUTTON,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>BeoingCustomComponent.button</code> attribute. 
	 * @param value the button
	 */
	public void setAllButton(final Map<Language,String> value)
	{
		setAllButton( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>BeoingCustomComponent.text</code> attribute.
	 * @return the text
	 */
	public String getText(final SessionContext ctx)
	{
		return (String)getProperty( ctx, TEXT);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>BeoingCustomComponent.text</code> attribute.
	 * @return the text
	 */
	public String getText()
	{
		return getText( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>BeoingCustomComponent.text</code> attribute. 
	 * @param value the text
	 */
	public void setText(final SessionContext ctx, final String value)
	{
		setProperty(ctx, TEXT,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>BeoingCustomComponent.text</code> attribute. 
	 * @param value the text
	 */
	public void setText(final String value)
	{
		setText( getSession().getSessionContext(), value );
	}
	
}
