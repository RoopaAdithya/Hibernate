package java;

public class WebServletConfiguration implements WebApplicationInitializer {

	public void onStartup(ServletContext ctx) throws ServletException {

		AnnotationConfigWebApplicationContext webCtx = new AnnotationConfigWebApplicationContext();

		webCtx.register(SpringConfig.class);

		webCtx.setServletContext(ctx);

		ServletRegistration.Dynamic servlet = ctx.addServlet("dispatcher",new DispatcherServlet(webCtx));

		servlet.setLoadOnStartup(1);

		servlet.addMapping("/");

	}
}
