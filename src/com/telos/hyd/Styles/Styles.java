package com.telos.hyd.Styles;

import com.codename1.l10n.SimpleDateFormat;
import com.codename1.ui.*;
import com.codename1.ui.events.ActionEvent;
import com.codename1.ui.events.ActionListener;
import com.codename1.ui.layouts.LayeredLayout;
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

    public static void setCompBgColor(Component c,int i)
    {
            c.getSelectedStyle().setBgColor(i);
            c.getUnselectedStyle().setBgColor(i);
            c.getStyle().setBgColor(i);
    }

    public static void setCompTranspColor(Component c,int i)
    {
        c.getSelectedStyle().setBgTransparency(i);
        c.getUnselectedStyle().setBgTransparency(i);
        c.getStyle().setBgTransparency(i);
    }

    public static void setButtonStyleForDialogBox(Button b) {
        b.getUnselectedStyle().setFgColor(0xFFFFFF);
        b.getSelectedStyle().setFgColor(0xFFFFFF);
        b.getStyle().setFgColor(0xFFFFFF);
        b.getPressedStyle().setFgColor(0xFFFFFF);

        b.getSelectedStyle().setBgTransparency(0);
        b.getUnselectedStyle().setBgTransparency(0);
        b.getStyle().setBorder(Border.createEmpty());
        b.getSelectedStyle().setBorder(Border.createEmpty());
        b.getUnselectedStyle().setBorder(Border.createEmpty());
        b.getPressedStyle().setBorder(Border.createEmpty());
    }


    public static Container getContainerForButtonInDialog(Resources theme, final Dialog dialog, final Button source, final String image, final String text) {
        Container layeredContainer = new Container();
        Label label = new Label();
        label.setIcon(theme.getImage(image));
        layeredContainer.setLayout(new LayeredLayout());
        layeredContainer.addComponent(label);

        Button b = new Button(text);
        layeredContainer.addComponent(b);

        Styles.setButtonStyleForDialogBox(b);
        b.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent evt) {
                source.setText(text);
                dialog.dispose();
            }
        });
        return layeredContainer;
    }
}