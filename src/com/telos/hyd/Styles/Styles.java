package com.telos.hyd.Styles;

import com.codename1.l10n.SimpleDateFormat;
import com.codename1.ui.Button;
import com.codename1.ui.Component;
import com.codename1.ui.plaf.Border;
import com.codename1.ui.util.Resources;



/**
 * Created by karthikmarupeddi on 11/23/14.
 */
public class Styles {

    public static void  ButtonStyles(Button button, String buttonName, Resources theme)
    {
        button.setGap(0);
        button.getStyle().setMargin(Component.BOTTOM, 0);
        button.setIcon(theme.getImage(buttonName));
        button.getStyle().setAlignment(Component.CENTER);
        button.getSelectedStyle().setBgTransparency(0);
        button.getUnselectedStyle().setBgTransparency(0);
        button.getStyle().setBorder(Border.createEmpty());
        button.getSelectedStyle().setBorder(Border.createEmpty());
        button.getUnselectedStyle().setBorder(Border.createEmpty());
        button.getPressedStyle().setBorder(Border.createEmpty());
        button.getStyle().setBgColor(0xffffff);
        button.getSelectedStyle().setBgColor(0xffffff);
        button.getUnselectedStyle().setBgColor(0xffffff);
    }

    public static void  ButtonStylesForDialog(Button button, String buttonName, Resources theme)
    {
        button.setGap(0);
        button.getStyle().setMargin(Component.BOTTOM, 0);
        button.setIcon(theme.getImage(buttonName));
        button.getStyle().setAlignment(Component.CENTER);
        button.getSelectedStyle().setBgTransparency(0);
        button.getUnselectedStyle().setBgTransparency(0);
        button.getStyle().setBorder(Border.createEmpty());
        button.getSelectedStyle().setBorder(Border.createEmpty());
        button.getUnselectedStyle().setBorder(Border.createEmpty());
        button.getPressedStyle().setBorder(Border.createEmpty());
        button.getStyle().setBgColor(0xffffff);
        button.getSelectedStyle().setBgColor(0xffffff);
        button.getUnselectedStyle().setBgColor(0xffffff);
    }

    public static void  ButtonStylesForHomePage(Button button, String buttonName, Resources theme)
    {
        button.setGap(0);
        button.getStyle().setMargin(Component.BOTTOM,0);
        button.setIcon(theme.getImage(buttonName));
        button.getStyle().setAlignment(Component.CENTER);
        button.getStyle().setBgTransparency(0);
        button.getSelectedStyle().setBgTransparency(0);
        button.getUnselectedStyle().setBgTransparency(0);
        button.getPressedStyle().setBgTransparency(0);
        button.getStyle().setBorder(Border.createEmpty());
        button.getSelectedStyle().setBorder(Border.createEmpty());
        button.getUnselectedStyle().setBorder(Border.createEmpty());
        button.getPressedStyle().setBorder(Border.createEmpty());
        button.getStyle().setPadding(10,10,10,10);
        button.getSelectedStyle().setPadding(10,10,10,10);
        button.getUnselectedStyle().setPadding(10,10,10,10);
    }


    //set style for search list cell
    public static void  ButtonStylesForCell(Button button, String buttonName, Resources theme)
    {
        button.setText(buttonName);
        button.setUIID("Label");
        button.getStyle().setPadding(10,10,0,0);
    }

    public static SimpleDateFormat simpleDateFormat =new SimpleDateFormat("dd-mm-yyyy");


}