package main.java.com.yali.form.controller;

import com.zoho.yali.conf.YConfig;
import com.zoho.yali.ds.DSContext;
import com.zoho.yali.view.ViewContext;
import com.zoho.yali.view.ViewController;
import com.zoho.yali.view.ViewModel;
import com.zoho.yali.view.ViewModelConstructionException;

public class FormViewController extends ViewController{

    public FormViewController(YConfig uiControlConfig) {
        super(uiControlConfig);
    }

    @Override
    public ViewModel getViewModel(ViewContext arg0, DSContext arg1) throws ViewModelConstructionException {
        return null;
    }
    
}
