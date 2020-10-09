package guru.springframework;

import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

import guru.springframework.config.SpringMvcConfiguration;

public class SampleSpringThymeleafWebAppInitializer extends AbstractAnnotationConfigDispatcherServletInitializer
{
	@Override
    protected String[] getServletMappings() {
        return new String[] {"/"};
    }

    @Override
    protected Class<?>[] getServletConfigClasses() {
        return new Class<?>[] {SpringMvcConfiguration.class};
    }

	@Override
	protected Class<?>[] getRootConfigClasses()
	{
		return null;
	}
}
