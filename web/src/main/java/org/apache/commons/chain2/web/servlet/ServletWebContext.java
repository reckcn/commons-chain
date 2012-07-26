package org.apache.commons.chain2.web.servlet;

import org.apache.commons.chain2.web.WebContext;

import javax.servlet.ServletContext;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.Map;

/**
 * @author Elijah Zupancic
 * @since 1.0.0
 */
public interface ServletWebContext<K, V> extends WebContext<K, V> {
    /**
     * <p>Return the {@link javax.servlet.ServletContext} for this context.</p>
     *
     * @return The <code>ServletContext</code> for this context.
     */
    ServletContext getContext();

    /**
     * <p>Return the {@link javax.servlet.http.HttpServletRequest} for this context.</p>
     *                     ServletWebContextBase
     * @return The <code>HttpServletRequest</code> for this context.
     */
    HttpServletRequest getRequest();

    /**
     * <p>Return the {@link javax.servlet.http.HttpServletResponse} for this context.</p>
     *
     * @return The <code>HttpServletResponse</code> for this context.
     */
    HttpServletResponse getResponse();

    /**
     * <p>Initialize (or reinitialize) this {@link ServletWebContext} instance
     * for the specified Servlet API objects.</p>
     *
     * @param context The <code>ServletContext</code> for this web application
     * @param request The <code>HttpServletRequest</code> for this request
     * @param response The <code>HttpServletResponse</code> for this request
     */
    void initialize(ServletContext context,
                    HttpServletRequest request,
                    HttpServletResponse response);

    /**
     * <p>Release references to allocated resources acquired in
     * <code>initialize()</code> of via subsequent processing.  After this
     * method is called, subsequent calls to any other method than
     * <code>initialize()</code> will return undefined results.</p>
     */
    void release();

    /**
     * See the {@link org.apache.commons.chain2.web.WebContext}'s Javadoc.
     *
     * @return Application scope Map.
     */
    Map<String, Object> getApplicationScope();

    /**
     * See the {@link org.apache.commons.chain2.web.WebContext}'s Javadoc.
     *
     * @return Header values Map.
     */
    Map<String, String> getHeader();

    /**
     * See the {@link org.apache.commons.chain2.web.WebContext}'s Javadoc.
     *
     * @return Header values Map.
     */
    Map<String, String[]> getHeaderValues();

    /**
     * See the {@link org.apache.commons.chain2.web.WebContext}'s Javadoc.
     *
     * @return Initialization parameter Map.
     */
    Map<String, String> getInitParam();

    /**
     * See the {@link org.apache.commons.chain2.web.WebContext}'s Javadoc.
     *
     * @return Request parameter Map.
     */
    Map<String, String> getParam();

    /**
     * See the {@link org.apache.commons.chain2.web.WebContext}'s Javadoc.
     *
     * @return Request parameter Map.
     */
    Map<String, String[]> getParamValues();

    /**
     * See the {@link org.apache.commons.chain2.web.WebContext}'s Javadoc.
     *
     * @return Map of Cookies.
     * @since Chain 1.1
     */
    Map<String, Cookie> getCookies();

    /**
     * See the {@link org.apache.commons.chain2.web.WebContext}'s Javadoc.
     *
     * @return Request scope Map.
     */
    Map<String, Object> getRequestScope();

    /**
     * See the {@link org.apache.commons.chain2.web.WebContext}'s Javadoc.
     *
     * @return Session scope Map.
     */
    Map<String, Object> getSessionScope();
}
