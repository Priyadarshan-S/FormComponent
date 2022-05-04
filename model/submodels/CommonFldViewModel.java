package main.java.com.yali.form.model.submodels;

import com.zoho.yali.conf.YConfig;

public class CommonFldViewModel extends ConstantFields{
    String placeholder,uiSize,pattern;
    int charLimit;

    public CommonFldViewModel(YConfig config) {
        super(config);
        this.placeholder = config.getString("placeholder");
        this.uiSize = config.getString("uiSize");
        this.charLimit = config.getInt("charLimit");
    }

    public String getPlaceholder() {
        return placeholder;
    }

    public String getUISize() {
        return uiSize;
    }

    public String getPattern() {
        return pattern;
    }
}
