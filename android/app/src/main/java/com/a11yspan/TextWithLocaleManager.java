package com.a11yspan;

import android.graphics.Color;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.facebook.react.uimanager.SimpleViewManager;
import com.facebook.react.uimanager.ThemedReactContext;
import com.facebook.react.uimanager.annotations.ReactProp;

import java.util.Locale;

public class TextWithLocaleManager extends SimpleViewManager<LinearLayout> {
    public static final String REACT_CLASS = "TextWithLocale";
    private LinearLayout view;
    private TextView text;

    @Override
    public String getName() {
      return REACT_CLASS;
    }

    @Override
    public LinearLayout createViewInstance(ThemedReactContext context){
        view = new LinearLayout(context);
        view.setBackgroundColor(Color.BLUE);
        text = new TextView(context);
        text.setText("Hello");
        view.addView(text);
        return view;
    }

    @ReactProp(name = "locale")
    public void setLocale(LinearLayout view, String prop) {
        text.setTextLocale(Locale.ITALIAN);
        text.setText("Pepe");
    }
}