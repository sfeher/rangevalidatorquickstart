package com.mycompany.mavenproject1;

import org.apache.wicket.request.mapper.parameter.PageParameters;
import org.apache.wicket.markup.html.WebPage;
import org.apache.wicket.markup.html.form.Form;
import org.apache.wicket.markup.html.form.RequiredTextField;
import org.apache.wicket.markup.html.panel.FeedbackPanel;
import org.apache.wicket.model.IModel;
import org.apache.wicket.model.Model;
import org.apache.wicket.validation.validator.RangeValidator;

public class HomePage extends WebPage {
	private static final long serialVersionUID = 1L;
        private Integer month;
        IModel<Integer> mmodel;

    public Integer getMonth() {
        return month;
    }

    public void setMonth(Integer month) {
        this.month = month;
    }
        RequiredTextField<Integer> m;
	public HomePage(final PageParameters parameters) {
		super(parameters);
                Form f=new Form("form");
                FeedbackPanel fb=new FeedbackPanel("feed");
                add(fb);
                m=new RequiredTextField<>("ho",new Model<Integer>(month));
                m.add(new RangeValidator(1,12));
                f.add(m);
		add(f);

		// TODO Add your page's components here

    }
}
