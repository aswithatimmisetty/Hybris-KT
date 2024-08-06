/*
 * ----------------------------------------------------------------
 * --- WARNING: THIS FILE IS GENERATED AND WILL BE OVERWRITTEN! ---
 * --- Generated at Aug 5, 2024, 8:56:48 PM                     ---
 * ----------------------------------------------------------------
 */
package my.bookstore.core.jalo;

import de.hybris.platform.jalo.Item;
import de.hybris.platform.jalo.Item.AttributeMode;
import de.hybris.platform.jalo.SessionContext;
import de.hybris.platform.jalo.product.Product;
import de.hybris.platform.jalo.type.ComposedType;
import de.hybris.platform.jalo.type.TypeManager;
import de.hybris.platform.jalo.user.User;
import de.hybris.platform.util.Utilities;
import java.util.Collection;
import java.util.Collections;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import my.bookstore.core.constants.BookstoreCoreConstants;

/**
 * Generated class for type {@link de.hybris.platform.jalo.product.Product BookDetails}.
 */
@SuppressWarnings({"deprecation","unused","cast"})
public abstract class GeneratedBookDetails extends Product
{
	/** Qualifier of the <code>BookDetails.BookId</code> attribute **/
	public static final String BOOKID = "BookId";
	/** Qualifier of the <code>BookDetails.Size</code> attribute **/
	public static final String SIZE = "Size";
	/** Qualifier of the <code>BookDetails.AuthorName</code> attribute **/
	public static final String AUTHORNAME = "AuthorName";
	/** Qualifier of the <code>BookDetails.Publisher</code> attribute **/
	public static final String PUBLISHER = "Publisher";
	/** Qualifier of the <code>BookDetails.PublishedDate</code> attribute **/
	public static final String PUBLISHEDDATE = "PublishedDate";
	/** Qualifier of the <code>BookDetails.Edition</code> attribute **/
	public static final String EDITION = "Edition";
	/** Qualifier of the <code>BookDetails.Publication</code> attribute **/
	public static final String PUBLICATION = "Publication";
	/** Qualifier of the <code>BookDetails.authors</code> attribute **/
	public static final String AUTHORS = "authors";
	/** Relation ordering override parameter constants for BookDetails2Author from ((bookstorecore))*/
	protected static String BOOKDETAILS2AUTHOR_SRC_ORDERED = "relation.BookDetails2Author.source.ordered";
	protected static String BOOKDETAILS2AUTHOR_TGT_ORDERED = "relation.BookDetails2Author.target.ordered";
	/** Relation disable markmodifed parameter constants for BookDetails2Author from ((bookstorecore))*/
	protected static String BOOKDETAILS2AUTHOR_MARKMODIFIED = "relation.BookDetails2Author.markmodified";
	protected static final Map<String, AttributeMode> DEFAULT_INITIAL_ATTRIBUTES;
	static
	{
		final Map<String, AttributeMode> tmp = new HashMap<String, AttributeMode>(Product.DEFAULT_INITIAL_ATTRIBUTES);
		tmp.put(BOOKID, AttributeMode.INITIAL);
		tmp.put(SIZE, AttributeMode.INITIAL);
		tmp.put(AUTHORNAME, AttributeMode.INITIAL);
		tmp.put(PUBLISHER, AttributeMode.INITIAL);
		tmp.put(PUBLISHEDDATE, AttributeMode.INITIAL);
		tmp.put(EDITION, AttributeMode.INITIAL);
		tmp.put(PUBLICATION, AttributeMode.INITIAL);
		DEFAULT_INITIAL_ATTRIBUTES = Collections.unmodifiableMap(tmp);
	}
	@Override
	protected Map<String, AttributeMode> getDefaultAttributeModes()
	{
		return DEFAULT_INITIAL_ATTRIBUTES;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>BookDetails.AuthorName</code> attribute.
	 * @return the AuthorName
	 */
	public String getAuthorName(final SessionContext ctx)
	{
		return (String)getProperty( ctx, AUTHORNAME);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>BookDetails.AuthorName</code> attribute.
	 * @return the AuthorName
	 */
	public String getAuthorName()
	{
		return getAuthorName( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>BookDetails.AuthorName</code> attribute. 
	 * @param value the AuthorName
	 */
	public void setAuthorName(final SessionContext ctx, final String value)
	{
		setProperty(ctx, AUTHORNAME,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>BookDetails.AuthorName</code> attribute. 
	 * @param value the AuthorName
	 */
	public void setAuthorName(final String value)
	{
		setAuthorName( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>BookDetails.authors</code> attribute.
	 * @return the authors
	 */
	public Collection<User> getAuthors(final SessionContext ctx)
	{
		final List<User> items = getLinkedItems( 
			ctx,
			true,
			BookstoreCoreConstants.Relations.BOOKDETAILS2AUTHOR,
			"User",
			null,
			false,
			false
		);
		return items;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>BookDetails.authors</code> attribute.
	 * @return the authors
	 */
	public Collection<User> getAuthors()
	{
		return getAuthors( getSession().getSessionContext() );
	}
	
	public long getAuthorsCount(final SessionContext ctx)
	{
		return getLinkedItemsCount(
			ctx,
			true,
			BookstoreCoreConstants.Relations.BOOKDETAILS2AUTHOR,
			"User",
			null
		);
	}
	
	public long getAuthorsCount()
	{
		return getAuthorsCount( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>BookDetails.authors</code> attribute. 
	 * @param value the authors
	 */
	public void setAuthors(final SessionContext ctx, final Collection<User> value)
	{
		setLinkedItems( 
			ctx,
			true,
			BookstoreCoreConstants.Relations.BOOKDETAILS2AUTHOR,
			null,
			value,
			false,
			false,
			Utilities.getMarkModifiedOverride(BOOKDETAILS2AUTHOR_MARKMODIFIED)
		);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>BookDetails.authors</code> attribute. 
	 * @param value the authors
	 */
	public void setAuthors(final Collection<User> value)
	{
		setAuthors( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Adds <code>value</code> to authors. 
	 * @param value the item to add to authors
	 */
	public void addToAuthors(final SessionContext ctx, final User value)
	{
		addLinkedItems( 
			ctx,
			true,
			BookstoreCoreConstants.Relations.BOOKDETAILS2AUTHOR,
			null,
			Collections.singletonList(value),
			false,
			false,
			Utilities.getMarkModifiedOverride(BOOKDETAILS2AUTHOR_MARKMODIFIED)
		);
	}
	
	/**
	 * <i>Generated method</i> - Adds <code>value</code> to authors. 
	 * @param value the item to add to authors
	 */
	public void addToAuthors(final User value)
	{
		addToAuthors( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Removes <code>value</code> from authors. 
	 * @param value the item to remove from authors
	 */
	public void removeFromAuthors(final SessionContext ctx, final User value)
	{
		removeLinkedItems( 
			ctx,
			true,
			BookstoreCoreConstants.Relations.BOOKDETAILS2AUTHOR,
			null,
			Collections.singletonList(value),
			false,
			false,
			Utilities.getMarkModifiedOverride(BOOKDETAILS2AUTHOR_MARKMODIFIED)
		);
	}
	
	/**
	 * <i>Generated method</i> - Removes <code>value</code> from authors. 
	 * @param value the item to remove from authors
	 */
	public void removeFromAuthors(final User value)
	{
		removeFromAuthors( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>BookDetails.BookId</code> attribute.
	 * @return the BookId - BookId
	 */
	public Integer getBookId(final SessionContext ctx)
	{
		return (Integer)getProperty( ctx, BOOKID);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>BookDetails.BookId</code> attribute.
	 * @return the BookId - BookId
	 */
	public Integer getBookId()
	{
		return getBookId( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>BookDetails.BookId</code> attribute. 
	 * @return the BookId - BookId
	 */
	public int getBookIdAsPrimitive(final SessionContext ctx)
	{
		Integer value = getBookId( ctx );
		return value != null ? value.intValue() : 0;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>BookDetails.BookId</code> attribute. 
	 * @return the BookId - BookId
	 */
	public int getBookIdAsPrimitive()
	{
		return getBookIdAsPrimitive( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>BookDetails.BookId</code> attribute. 
	 * @param value the BookId - BookId
	 */
	public void setBookId(final SessionContext ctx, final Integer value)
	{
		setProperty(ctx, BOOKID,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>BookDetails.BookId</code> attribute. 
	 * @param value the BookId - BookId
	 */
	public void setBookId(final Integer value)
	{
		setBookId( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>BookDetails.BookId</code> attribute. 
	 * @param value the BookId - BookId
	 */
	public void setBookId(final SessionContext ctx, final int value)
	{
		setBookId( ctx,Integer.valueOf( value ) );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>BookDetails.BookId</code> attribute. 
	 * @param value the BookId - BookId
	 */
	public void setBookId(final int value)
	{
		setBookId( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>BookDetails.Edition</code> attribute.
	 * @return the Edition - Book edition
	 */
	public Integer getEdition(final SessionContext ctx)
	{
		return (Integer)getProperty( ctx, EDITION);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>BookDetails.Edition</code> attribute.
	 * @return the Edition - Book edition
	 */
	public Integer getEdition()
	{
		return getEdition( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>BookDetails.Edition</code> attribute. 
	 * @return the Edition - Book edition
	 */
	public int getEditionAsPrimitive(final SessionContext ctx)
	{
		Integer value = getEdition( ctx );
		return value != null ? value.intValue() : 0;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>BookDetails.Edition</code> attribute. 
	 * @return the Edition - Book edition
	 */
	public int getEditionAsPrimitive()
	{
		return getEditionAsPrimitive( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>BookDetails.Edition</code> attribute. 
	 * @param value the Edition - Book edition
	 */
	public void setEdition(final SessionContext ctx, final Integer value)
	{
		setProperty(ctx, EDITION,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>BookDetails.Edition</code> attribute. 
	 * @param value the Edition - Book edition
	 */
	public void setEdition(final Integer value)
	{
		setEdition( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>BookDetails.Edition</code> attribute. 
	 * @param value the Edition - Book edition
	 */
	public void setEdition(final SessionContext ctx, final int value)
	{
		setEdition( ctx,Integer.valueOf( value ) );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>BookDetails.Edition</code> attribute. 
	 * @param value the Edition - Book edition
	 */
	public void setEdition(final int value)
	{
		setEdition( getSession().getSessionContext(), value );
	}
	
	/**
	 * @deprecated since 2011, use {@link Utilities#getMarkModifiedOverride(de.hybris.platform.jalo.type.RelationType)
	 */
	@Override
	@Deprecated(since = "2105", forRemoval = true)
	public boolean isMarkModifiedDisabled(final Item referencedItem)
	{
		ComposedType relationSecondEnd0 = TypeManager.getInstance().getComposedType("User");
		if(relationSecondEnd0.isAssignableFrom(referencedItem.getComposedType()))
		{
			return Utilities.getMarkModifiedOverride(BOOKDETAILS2AUTHOR_MARKMODIFIED);
		}
		return true;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>BookDetails.Publication</code> attribute.
	 * @return the Publication - Book publication
	 */
	public String getPublication(final SessionContext ctx)
	{
		return (String)getProperty( ctx, PUBLICATION);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>BookDetails.Publication</code> attribute.
	 * @return the Publication - Book publication
	 */
	public String getPublication()
	{
		return getPublication( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>BookDetails.Publication</code> attribute. 
	 * @param value the Publication - Book publication
	 */
	public void setPublication(final SessionContext ctx, final String value)
	{
		setProperty(ctx, PUBLICATION,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>BookDetails.Publication</code> attribute. 
	 * @param value the Publication - Book publication
	 */
	public void setPublication(final String value)
	{
		setPublication( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>BookDetails.PublishedDate</code> attribute.
	 * @return the PublishedDate - Publisher of the book
	 */
	public Date getPublishedDate(final SessionContext ctx)
	{
		return (Date)getProperty( ctx, PUBLISHEDDATE);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>BookDetails.PublishedDate</code> attribute.
	 * @return the PublishedDate - Publisher of the book
	 */
	public Date getPublishedDate()
	{
		return getPublishedDate( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>BookDetails.PublishedDate</code> attribute. 
	 * @param value the PublishedDate - Publisher of the book
	 */
	public void setPublishedDate(final SessionContext ctx, final Date value)
	{
		setProperty(ctx, PUBLISHEDDATE,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>BookDetails.PublishedDate</code> attribute. 
	 * @param value the PublishedDate - Publisher of the book
	 */
	public void setPublishedDate(final Date value)
	{
		setPublishedDate( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>BookDetails.Publisher</code> attribute.
	 * @return the Publisher - Publisher of the book
	 */
	public String getPublisher(final SessionContext ctx)
	{
		return (String)getProperty( ctx, PUBLISHER);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>BookDetails.Publisher</code> attribute.
	 * @return the Publisher - Publisher of the book
	 */
	public String getPublisher()
	{
		return getPublisher( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>BookDetails.Publisher</code> attribute. 
	 * @param value the Publisher - Publisher of the book
	 */
	public void setPublisher(final SessionContext ctx, final String value)
	{
		setProperty(ctx, PUBLISHER,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>BookDetails.Publisher</code> attribute. 
	 * @param value the Publisher - Publisher of the book
	 */
	public void setPublisher(final String value)
	{
		setPublisher( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>BookDetails.Size</code> attribute.
	 * @return the Size - International Standard Book Size with Integer
	 */
	public Integer getSize(final SessionContext ctx)
	{
		return (Integer)getProperty( ctx, SIZE);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>BookDetails.Size</code> attribute.
	 * @return the Size - International Standard Book Size with Integer
	 */
	public Integer getSize()
	{
		return getSize( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>BookDetails.Size</code> attribute. 
	 * @return the Size - International Standard Book Size with Integer
	 */
	public int getSizeAsPrimitive(final SessionContext ctx)
	{
		Integer value = getSize( ctx );
		return value != null ? value.intValue() : 0;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>BookDetails.Size</code> attribute. 
	 * @return the Size - International Standard Book Size with Integer
	 */
	public int getSizeAsPrimitive()
	{
		return getSizeAsPrimitive( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>BookDetails.Size</code> attribute. 
	 * @param value the Size - International Standard Book Size with Integer
	 */
	public void setSize(final SessionContext ctx, final Integer value)
	{
		setProperty(ctx, SIZE,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>BookDetails.Size</code> attribute. 
	 * @param value the Size - International Standard Book Size with Integer
	 */
	public void setSize(final Integer value)
	{
		setSize( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>BookDetails.Size</code> attribute. 
	 * @param value the Size - International Standard Book Size with Integer
	 */
	public void setSize(final SessionContext ctx, final int value)
	{
		setSize( ctx,Integer.valueOf( value ) );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>BookDetails.Size</code> attribute. 
	 * @param value the Size - International Standard Book Size with Integer
	 */
	public void setSize(final int value)
	{
		setSize( getSession().getSessionContext(), value );
	}
	
}
