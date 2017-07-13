package e3iswseis;

import javax.microedition.midlet.*;
import javax.microedition.lcdui.*;
import org.netbeans.microedition.util.SimpleCancellableTask;

public class defterova8mia extends MIDlet implements CommandListener {

    private boolean midletPaused = false;
    //<editor-fold defaultstate="collapsed" desc=" Generated Fields ">//GEN-BEGIN:|fields|0|
    private java.util.Hashtable __previousDisplayables = new java.util.Hashtable();
    private Form form;
    private TextField textField1;
    private TextField textField;
    private TextField textField3;
    private TextField textField2;
    private TextField textField5;
    private TextField textField4;
    private Form form1;
    private TextField textField6;
    private TextField textField7;
    private TextField textField8;
    private Form form3;
    private TextField textField9;
    private TextField textField10;
    private TextField textField11;
    private TextField textField12;
    private TextField textField13;
    private TextField textField14;
    private TextField textField15;
    private TextField textField16;
    private List list;
    private Command okCommand;
    private Command exitCommand;
    private Command itemCommand;
    private Command itemCommand1;
    private Command itemCommand2;
    private Command itemCommand3;
    private Command screenCommand;
    private Command okCommand1;
    private Command okCommand2;
    private Command exitCommand1;
    private Command exitCommand2;
    private Command okCommand3;
    private Command exitCommand3;
    //</editor-fold>//GEN-END:|fields|0|

    public defterova8mia() {
    }

    //<editor-fold defaultstate="collapsed" desc=" Generated Methods ">//GEN-BEGIN:|methods|0|
    /**
     * Switches a display to previous displayable of the current displayable.
     * The <code>display</code> instance is obtain from the <code>getDisplay</code> method.
     */
    private void switchToPreviousDisplayable() {
        Displayable __currentDisplayable = getDisplay().getCurrent();
        if (__currentDisplayable != null) {
            Displayable __nextDisplayable = (Displayable) __previousDisplayables.get(__currentDisplayable);
            if (__nextDisplayable != null) {
                switchDisplayable(null, __nextDisplayable);
            }
        }
    }
    //</editor-fold>//GEN-END:|methods|0|
    //<editor-fold defaultstate="collapsed" desc=" Generated Method: initialize ">//GEN-BEGIN:|0-initialize|0|0-preInitialize
    /**
     * Initilizes the application.
     * It is called only once when the MIDlet is started. The method is called before the <code>startMIDlet</code> method.
     */
    private void initialize() {//GEN-END:|0-initialize|0|0-preInitialize
        // write pre-initialize user code here
//GEN-LINE:|0-initialize|1|0-postInitialize
    }//GEN-BEGIN:|0-initialize|2|
    //</editor-fold>//GEN-END:|0-initialize|2|

    //<editor-fold defaultstate="collapsed" desc=" Generated Method: startMIDlet ">//GEN-BEGIN:|3-startMIDlet|0|3-preAction
    /**
     * Performs an action assigned to the Mobile Device - MIDlet Started point.
     */
    public void startMIDlet() {//GEN-END:|3-startMIDlet|0|3-preAction


        switchDisplayable(null, getList());//GEN-LINE:|3-startMIDlet|1|3-postAction

    }//GEN-BEGIN:|3-startMIDlet|2|
    //</editor-fold>//GEN-END:|3-startMIDlet|2|

    //<editor-fold defaultstate="collapsed" desc=" Generated Method: resumeMIDlet ">//GEN-BEGIN:|4-resumeMIDlet|0|4-preAction
    /**
     * Performs an action assigned to the Mobile Device - MIDlet Resumed point.
     */
    public void resumeMIDlet() {//GEN-END:|4-resumeMIDlet|0|4-preAction
        // write pre-action user code here
//GEN-LINE:|4-resumeMIDlet|1|4-postAction
        // write post-action user code here
    }//GEN-BEGIN:|4-resumeMIDlet|2|
    //</editor-fold>//GEN-END:|4-resumeMIDlet|2|

    //<editor-fold defaultstate="collapsed" desc=" Generated Method: switchDisplayable ">//GEN-BEGIN:|5-switchDisplayable|0|5-preSwitch
    /**
     * Switches a current displayable in a display. The <code>display</code> instance is taken from <code>getDisplay</code> method. This method is used by all actions in the design for switching displayable.
     * @param alert the Alert which is temporarily set to the display; if <code>null</code>, then <code>nextDisplayable</code> is set immediately
     * @param nextDisplayable the Displayable to be set
     */
    public void switchDisplayable(Alert alert, Displayable nextDisplayable) {//GEN-END:|5-switchDisplayable|0|5-preSwitch
        // write pre-switch user code here
        Display display = getDisplay();//GEN-BEGIN:|5-switchDisplayable|1|5-postSwitch
        Displayable __currentDisplayable = display.getCurrent();
        if (__currentDisplayable != null  &&  nextDisplayable != null) {
            __previousDisplayables.put(nextDisplayable, __currentDisplayable);
        }
        if (alert == null) {
            display.setCurrent(nextDisplayable);
        } else {
            display.setCurrent(alert, nextDisplayable);
        }//GEN-END:|5-switchDisplayable|1|5-postSwitch
        // write post-switch user code here
    }//GEN-BEGIN:|5-switchDisplayable|2|
    //</editor-fold>//GEN-END:|5-switchDisplayable|2|

    //<editor-fold defaultstate="collapsed" desc=" Generated Getter: form ">//GEN-BEGIN:|14-getter|0|14-preInit
    /**
     * Returns an initiliazed instance of form component.
     * @return the initialized component instance
     */
    public Form getForm() {
        if (form == null) {//GEN-END:|14-getter|0|14-preInit
            // write pre-init user code here
            form = new Form("defterova8mia", new Item[] { getTextField(), getTextField1(), getTextField2(), getTextField3(), getTextField4(), getTextField5() });//GEN-BEGIN:|14-getter|1|14-postInit
            form.addCommand(getOkCommand());
            form.addCommand(getExitCommand());
            form.setCommandListener(this);//GEN-END:|14-getter|1|14-postInit

        }//GEN-BEGIN:|14-getter|2|
        return form;
    }
    //</editor-fold>//GEN-END:|14-getter|2|

    //<editor-fold defaultstate="collapsed" desc=" Generated Method: commandAction for Displayables ">//GEN-BEGIN:|7-commandAction|0|7-preCommandAction
    /**
     * Called by a system to indicated that a command has been invoked on a particular displayable.
     * @param command the Command that was invoked
     * @param displayable the Displayable where the command was invoked
     */
    public void commandAction(Command command, Displayable displayable) {//GEN-END:|7-commandAction|0|7-preCommandAction
        // write pre-action user code here
        if (displayable == form) {//GEN-BEGIN:|7-commandAction|1|23-preAction
            if (command == exitCommand) {//GEN-END:|7-commandAction|1|23-preAction
                // write pre-action user code here
                switchDisplayable(null, getList());//GEN-LINE:|7-commandAction|2|23-postAction

            } else if (command == okCommand) {//GEN-LINE:|7-commandAction|3|21-preAction
                double a = Integer.parseInt(textField.getString());
                double b = Integer.parseInt(textField1.getString());
                double c = Integer.parseInt(textField2.getString());
//GEN-LINE:|7-commandAction|4|21-postAction
                if (a == 0) {
                    if (b == 0) {
                        if (c == 0) {
                            textField4.setString("aoristi");
                        } else {
                            textField4.setString("adinati");
                        }
                    } else {
                        double x1 = -(c / b);

                        textField4.setString(String.valueOf(x1));
                    }
                    textField5.setString("prwtova8mia");
                    textField3.setString("prwtova8mia");

                } else {
                    double d = Math.abs(b * b) - (4 * a * c);
                    if (d < 0) {
                        textField3.setString(String.valueOf(d));
                        textField4.setString("oxi rizes");
                        textField5.setString("oxi rizes");
                    } else {
                        if (d == 0) {
                            textField3.setString(String.valueOf(d));
                            double x1 = -b / (2 * a);
                            textField4.setString(String.valueOf(x1));
                            textField5.setString(String.valueOf(x1));
                        } else {

                            textField3.setString(String.valueOf(d));
                            double x1 = (-b + Math.sqrt(d)) / (2 * a);
                            double x2 = (-b - Math.sqrt(d)) / (2 * a);
                            textField4.setString(String.valueOf(x1));
                            textField5.setString(String.valueOf(x2));
                        }
                    }
                }
            }//GEN-BEGIN:|7-commandAction|5|114-preAction
        } else if (displayable == form1) {
            if (command == exitCommand1) {//GEN-END:|7-commandAction|5|114-preAction
                // write pre-action user code here
                switchToPreviousDisplayable();//GEN-LINE:|7-commandAction|6|114-postAction
                // write post-action user code here
            } else if (command == okCommand2) {//GEN-LINE:|7-commandAction|7|112-preAction
                double b = Integer.parseInt(textField6.getString());
                double c = Integer.parseInt(textField7.getString());
//GEN-LINE:|7-commandAction|8|112-postAction

                if (b == 0) {
                    if (c == 0) {
                        textField8.setString("aoristi");
                    } else {
                        textField8.setString("adinati");
                    }
                } else {
                    double x1 = -(c / b);
                    textField8.setString(String.valueOf(x1));
                }
            }//GEN-BEGIN:|7-commandAction|9|132-preAction
        } else if (displayable == form3) {
            if (command == exitCommand3) {//GEN-END:|7-commandAction|9|132-preAction
                // write pre-action user code here
                switchToPreviousDisplayable();//GEN-LINE:|7-commandAction|10|132-postAction
                // write post-action user code here
            } else if (command == okCommand3) {//GEN-LINE:|7-commandAction|11|130-preAction
                double a1=Integer.parseInt(textField9.getString());
                double b1=Integer.parseInt(textField10.getString());
                double c1=Integer.parseInt(textField11.getString());
                double a2=Integer.parseInt(textField12.getString());
                double b2=Integer.parseInt(textField13.getString());
                double c2=Integer.parseInt(textField14.getString());
//GEN-LINE:|7-commandAction|12|130-postAction
                // write post-action user code here
            }//GEN-BEGIN:|7-commandAction|13|89-preAction
        } else if (displayable == list) {
            if (command == List.SELECT_COMMAND) {//GEN-END:|7-commandAction|13|89-preAction
                // write pre-action user code here
                listAction();//GEN-LINE:|7-commandAction|14|89-postAction
                // write post-action user code here
            } else if (command == okCommand1) {//GEN-LINE:|7-commandAction|15|96-preAction
                // write pre-action user code here
                listAction();//GEN-LINE:|7-commandAction|16|96-postAction
                // write post-action user code here
            }//GEN-BEGIN:|7-commandAction|17|7-postCommandAction
        }//GEN-END:|7-commandAction|17|7-postCommandAction
        // write post-action user code here
    }//GEN-BEGIN:|7-commandAction|18|
    //</editor-fold>//GEN-END:|7-commandAction|18|

    //<editor-fold defaultstate="collapsed" desc=" Generated Getter: okCommand ">//GEN-BEGIN:|20-getter|0|20-preInit
    /**
     * Returns an initiliazed instance of okCommand component.
     * @return the initialized component instance
     */
    public Command getOkCommand() {
        if (okCommand == null) {//GEN-END:|20-getter|0|20-preInit
            // write pre-init user code here
            okCommand = new Command("Ok", Command.OK, 0);//GEN-LINE:|20-getter|1|20-postInit
            // write post-init user code here
        }//GEN-BEGIN:|20-getter|2|
        return okCommand;
    }
    //</editor-fold>//GEN-END:|20-getter|2|

    //<editor-fold defaultstate="collapsed" desc=" Generated Getter: exitCommand ">//GEN-BEGIN:|22-getter|0|22-preInit
    /**
     * Returns an initiliazed instance of exitCommand component.
     * @return the initialized component instance
     */
    public Command getExitCommand() {
        if (exitCommand == null) {//GEN-END:|22-getter|0|22-preInit

            exitCommand = new Command("Exit", Command.EXIT, 0);//GEN-LINE:|22-getter|1|22-postInit


        }//GEN-BEGIN:|22-getter|2|
        return exitCommand;
    }
    //</editor-fold>//GEN-END:|22-getter|2|

    //<editor-fold defaultstate="collapsed" desc=" Generated Getter: textField ">//GEN-BEGIN:|26-getter|0|26-preInit
    /**
     * Returns an initiliazed instance of textField component.
     * @return the initialized component instance
     */
    public TextField getTextField() {
        if (textField == null) {//GEN-END:|26-getter|0|26-preInit
        // write pre-init user code here
            textField = new TextField("ax^2", null, 32, TextField.NUMERIC);//GEN-BEGIN:|26-getter|1|26-postInit
            textField.setLayout(ImageItem.LAYOUT_DEFAULT);//GEN-END:|26-getter|1|26-postInit
        // write post-init user code here
        }//GEN-BEGIN:|26-getter|2|
        return textField;
    }
    //</editor-fold>//GEN-END:|26-getter|2|

    //<editor-fold defaultstate="collapsed" desc=" Generated Getter: textField1 ">//GEN-BEGIN:|27-getter|0|27-preInit
    /**
     * Returns an initiliazed instance of textField1 component.
     * @return the initialized component instance
     */
    public TextField getTextField1() {
        if (textField1 == null) {//GEN-END:|27-getter|0|27-preInit
                // write pre-init user code here
            textField1 = new TextField("bx", null, 32, TextField.NUMERIC);//GEN-LINE:|27-getter|1|27-postInit
                // write post-init user code here
        }//GEN-BEGIN:|27-getter|2|
        return textField1;
    }
    //</editor-fold>//GEN-END:|27-getter|2|

    //<editor-fold defaultstate="collapsed" desc=" Generated Getter: textField2 ">//GEN-BEGIN:|28-getter|0|28-preInit
    /**
     * Returns an initiliazed instance of textField2 component.
     * @return the initialized component instance
     */
    public TextField getTextField2() {
        if (textField2 == null) {//GEN-END:|28-getter|0|28-preInit
                // write pre-init user code here
            textField2 = new TextField("c", null, 32, TextField.NUMERIC);//GEN-LINE:|28-getter|1|28-postInit
                // write post-init user code here
        }//GEN-BEGIN:|28-getter|2|
        return textField2;
    }
    //</editor-fold>//GEN-END:|28-getter|2|

    //<editor-fold defaultstate="collapsed" desc=" Generated Getter: textField3 ">//GEN-BEGIN:|29-getter|0|29-preInit
    /**
     * Returns an initiliazed instance of textField3 component.
     * @return the initialized component instance
     */
    public TextField getTextField3() {
        if (textField3 == null) {//GEN-END:|29-getter|0|29-preInit
            // write pre-init user code here
            textField3 = new TextField("diakrinousa", null, 32, TextField.ANY | TextField.UNEDITABLE);//GEN-LINE:|29-getter|1|29-postInit
            // write post-init user code here
        }//GEN-BEGIN:|29-getter|2|
        return textField3;
    }
    //</editor-fold>//GEN-END:|29-getter|2|

    //<editor-fold defaultstate="collapsed" desc=" Generated Getter: textField4 ">//GEN-BEGIN:|30-getter|0|30-preInit
    /**
     * Returns an initiliazed instance of textField4 component.
     * @return the initialized component instance
     */
    public TextField getTextField4() {
        if (textField4 == null) {//GEN-END:|30-getter|0|30-preInit
            // write pre-init user code here
            textField4 = new TextField("x1", null, 32, TextField.ANY | TextField.UNEDITABLE);//GEN-LINE:|30-getter|1|30-postInit
            // write post-init user code here
        }//GEN-BEGIN:|30-getter|2|
        return textField4;
    }
    //</editor-fold>//GEN-END:|30-getter|2|

    //<editor-fold defaultstate="collapsed" desc=" Generated Getter: textField5 ">//GEN-BEGIN:|31-getter|0|31-preInit
    /**
     * Returns an initiliazed instance of textField5 component.
     * @return the initialized component instance
     */
    public TextField getTextField5() {
        if (textField5 == null) {//GEN-END:|31-getter|0|31-preInit
            // write pre-init user code here
            textField5 = new TextField("x2", null, 32, TextField.ANY | TextField.UNEDITABLE);//GEN-LINE:|31-getter|1|31-postInit
            // write post-init user code here
        }//GEN-BEGIN:|31-getter|2|
        return textField5;
    }
    //</editor-fold>//GEN-END:|31-getter|2|

    //<editor-fold defaultstate="collapsed" desc=" Generated Getter: form1 ">//GEN-BEGIN:|36-getter|0|36-preInit
    /**
     * Returns an initiliazed instance of form1 component.
     * @return the initialized component instance
     */
    public Form getForm1() {
        if (form1 == null) {//GEN-END:|36-getter|0|36-preInit
            // write pre-init user code here
            form1 = new Form("form1", new Item[] { getTextField6(), getTextField7(), getTextField8() });//GEN-BEGIN:|36-getter|1|36-postInit
            form1.addCommand(getOkCommand2());
            form1.addCommand(getExitCommand1());
            form1.setCommandListener(this);//GEN-END:|36-getter|1|36-postInit
            // write post-init user code here
        }//GEN-BEGIN:|36-getter|2|
        return form1;
    }
    //</editor-fold>//GEN-END:|36-getter|2|

    //<editor-fold defaultstate="collapsed" desc=" Generated Getter: form3 ">//GEN-BEGIN:|38-getter|0|38-preInit
    /**
     * Returns an initiliazed instance of form3 component.
     * @return the initialized component instance
     */
    public Form getForm3() {
        if (form3 == null) {//GEN-END:|38-getter|0|38-preInit
            // write pre-init user code here
            form3 = new Form("form3", new Item[] { getTextField9(), getTextField10(), getTextField11(), getTextField12(), getTextField13(), getTextField14(), getTextField15(), getTextField16() });//GEN-BEGIN:|38-getter|1|38-postInit
            form3.addCommand(getOkCommand3());
            form3.addCommand(getExitCommand3());
            form3.setCommandListener(this);//GEN-END:|38-getter|1|38-postInit
            // write post-init user code here
        }//GEN-BEGIN:|38-getter|2|
        return form3;
    }
    //</editor-fold>//GEN-END:|38-getter|2|

    //<editor-fold defaultstate="collapsed" desc=" Generated Getter: itemCommand ">//GEN-BEGIN:|40-getter|0|40-preInit
    /**
     * Returns an initiliazed instance of itemCommand component.
     * @return the initialized component instance
     */
    public Command getItemCommand() {
        if (itemCommand == null) {//GEN-END:|40-getter|0|40-preInit
            // write pre-init user code here
            itemCommand = new Command("Item", Command.ITEM, 0);//GEN-LINE:|40-getter|1|40-postInit
            // write post-init user code here
        }//GEN-BEGIN:|40-getter|2|
        return itemCommand;
    }
    //</editor-fold>//GEN-END:|40-getter|2|

    //<editor-fold defaultstate="collapsed" desc=" Generated Getter: itemCommand1 ">//GEN-BEGIN:|42-getter|0|42-preInit
    /**
     * Returns an initiliazed instance of itemCommand1 component.
     * @return the initialized component instance
     */
    public Command getItemCommand1() {
        if (itemCommand1 == null) {//GEN-END:|42-getter|0|42-preInit
            // write pre-init user code here
            itemCommand1 = new Command("Item", Command.ITEM, 0);//GEN-LINE:|42-getter|1|42-postInit
            // write post-init user code here
        }//GEN-BEGIN:|42-getter|2|
        return itemCommand1;
    }
    //</editor-fold>//GEN-END:|42-getter|2|

    //<editor-fold defaultstate="collapsed" desc=" Generated Getter: itemCommand2 ">//GEN-BEGIN:|44-getter|0|44-preInit
    /**
     * Returns an initiliazed instance of itemCommand2 component.
     * @return the initialized component instance
     */
    public Command getItemCommand2() {
        if (itemCommand2 == null) {//GEN-END:|44-getter|0|44-preInit
            // write pre-init user code here
            itemCommand2 = new Command("Item", Command.ITEM, 0);//GEN-LINE:|44-getter|1|44-postInit
            // write post-init user code here
        }//GEN-BEGIN:|44-getter|2|
        return itemCommand2;
    }
    //</editor-fold>//GEN-END:|44-getter|2|

    //<editor-fold defaultstate="collapsed" desc=" Generated Getter: itemCommand3 ">//GEN-BEGIN:|46-getter|0|46-preInit
    /**
     * Returns an initiliazed instance of itemCommand3 component.
     * @return the initialized component instance
     */
    public Command getItemCommand3() {
        if (itemCommand3 == null) {//GEN-END:|46-getter|0|46-preInit
            // write pre-init user code here
            itemCommand3 = new Command("Item", Command.ITEM, 0);//GEN-LINE:|46-getter|1|46-postInit
            // write post-init user code here
        }//GEN-BEGIN:|46-getter|2|
        return itemCommand3;
    }
    //</editor-fold>//GEN-END:|46-getter|2|

    //<editor-fold defaultstate="collapsed" desc=" Generated Getter: screenCommand ">//GEN-BEGIN:|52-getter|0|52-preInit
    /**
     * Returns an initiliazed instance of screenCommand component.
     * @return the initialized component instance
     */
    public Command getScreenCommand() {
        if (screenCommand == null) {//GEN-END:|52-getter|0|52-preInit
            // write pre-init user code here
            screenCommand = new Command("Screen", Command.SCREEN, 0);//GEN-LINE:|52-getter|1|52-postInit
            // write post-init user code here
        }//GEN-BEGIN:|52-getter|2|
        return screenCommand;
    }
    //</editor-fold>//GEN-END:|52-getter|2|

    // enter pre-action user code here
    // enter post-action user code here
//<editor-fold defaultstate="collapsed" desc=" Generated Getter: list ">//GEN-BEGIN:|88-getter|0|88-preInit
/**
 * Returns an initiliazed instance of list component.
 * @return the initialized component instance
 */
public List getList() {
    if (list == null) {//GEN-END:|88-getter|0|88-preInit
            // write pre-init user code here
        list = new List("e3iswseis", Choice.IMPLICIT);//GEN-BEGIN:|88-getter|1|88-postInit
        list.append("ax+b=0", null);
        list.append("ax^2+bx+c", null);
        list.addCommand(getOkCommand1());
        list.setCommandListener(this);
        list.setSelectedFlags(new boolean[] { false, false });//GEN-END:|88-getter|1|88-postInit
            // write post-init user code here
    }//GEN-BEGIN:|88-getter|2|
    return list;
}
//</editor-fold>//GEN-END:|88-getter|2|

//<editor-fold defaultstate="collapsed" desc=" Generated Method: listAction ">//GEN-BEGIN:|88-action|0|88-preAction
/**
 * Performs an action assigned to the selected list element in the list component.
 */
public void listAction() {//GEN-END:|88-action|0|88-preAction
        // enter pre-action user code here
    String __selectedString = getList().getString(getList().getSelectedIndex());//GEN-BEGIN:|88-action|1|97-preAction
    if (__selectedString != null) {
        if (__selectedString.equals("ax+b=0")) {//GEN-END:|88-action|1|97-preAction
                // write pre-action user code here
            switchDisplayable(null, getForm1());//GEN-LINE:|88-action|2|97-postAction
                // write post-action user code here
        } else if (__selectedString.equals("ax^2+bx+c")) {//GEN-LINE:|88-action|3|98-preAction
                // write pre-action user code here
            switchDisplayable(null, getForm());//GEN-LINE:|88-action|4|98-postAction
                // write post-action user code here
        }//GEN-BEGIN:|88-action|5|88-postAction
    }//GEN-END:|88-action|5|88-postAction
        // enter post-action user code here
}//GEN-BEGIN:|88-action|6|99-postAction
//</editor-fold>//GEN-END:|88-action|6|99-postAction


//<editor-fold defaultstate="collapsed" desc=" Generated Getter: okCommand1 ">//GEN-BEGIN:|95-getter|0|95-preInit
/**
 * Returns an initiliazed instance of okCommand1 component.
 * @return the initialized component instance
 */
public Command getOkCommand1() {
    if (okCommand1 == null) {//GEN-END:|95-getter|0|95-preInit
            // write pre-init user code here
        okCommand1 = new Command("Ok", Command.OK, 0);//GEN-LINE:|95-getter|1|95-postInit
            // write post-init user code here
    }//GEN-BEGIN:|95-getter|2|
    return okCommand1;
}
//</editor-fold>//GEN-END:|95-getter|2|

//<editor-fold defaultstate="collapsed" desc=" Generated Getter: okCommand2 ">//GEN-BEGIN:|111-getter|0|111-preInit
/**
 * Returns an initiliazed instance of okCommand2 component.
 * @return the initialized component instance
 */
public Command getOkCommand2() {
    if (okCommand2 == null) {//GEN-END:|111-getter|0|111-preInit
            // write pre-init user code here
        okCommand2 = new Command("Ok", Command.OK, 0);//GEN-LINE:|111-getter|1|111-postInit
            // write post-init user code here
    }//GEN-BEGIN:|111-getter|2|
    return okCommand2;
}
//</editor-fold>//GEN-END:|111-getter|2|

//<editor-fold defaultstate="collapsed" desc=" Generated Getter: exitCommand1 ">//GEN-BEGIN:|113-getter|0|113-preInit
/**
 * Returns an initiliazed instance of exitCommand1 component.
 * @return the initialized component instance
 */
public Command getExitCommand1() {
    if (exitCommand1 == null) {//GEN-END:|113-getter|0|113-preInit
            // write pre-init user code here
        exitCommand1 = new Command("Exit", Command.EXIT, 0);//GEN-LINE:|113-getter|1|113-postInit
            // write post-init user code here
    }//GEN-BEGIN:|113-getter|2|
    return exitCommand1;
}
//</editor-fold>//GEN-END:|113-getter|2|

//<editor-fold defaultstate="collapsed" desc=" Generated Getter: exitCommand2 ">//GEN-BEGIN:|115-getter|0|115-preInit
/**
 * Returns an initiliazed instance of exitCommand2 component.
 * @return the initialized component instance
 */
public Command getExitCommand2() {
    if (exitCommand2 == null) {//GEN-END:|115-getter|0|115-preInit
            // write pre-init user code here
        exitCommand2 = new Command("Exit", Command.EXIT, 0);//GEN-LINE:|115-getter|1|115-postInit
            // write post-init user code here
    }//GEN-BEGIN:|115-getter|2|
    return exitCommand2;
}
//</editor-fold>//GEN-END:|115-getter|2|

        //<editor-fold defaultstate="collapsed" desc=" Generated Getter: textField6 ">//GEN-BEGIN:|118-getter|0|118-preInit
        /**
         * Returns an initiliazed instance of textField6 component.
         * @return the initialized component instance
         */
        public TextField getTextField6() {
            if (textField6 == null) {//GEN-END:|118-getter|0|118-preInit
            // write pre-init user code here
                textField6 = new TextField("ax", null, 32, TextField.NUMERIC);//GEN-LINE:|118-getter|1|118-postInit
            // write post-init user code here
            }//GEN-BEGIN:|118-getter|2|
            return textField6;
        }
        //</editor-fold>//GEN-END:|118-getter|2|

        //<editor-fold defaultstate="collapsed" desc=" Generated Getter: textField7 ">//GEN-BEGIN:|119-getter|0|119-preInit
        /**
         * Returns an initiliazed instance of textField7 component.
         * @return the initialized component instance
         */
        public TextField getTextField7() {
            if (textField7 == null) {//GEN-END:|119-getter|0|119-preInit
            // write pre-init user code here
                textField7 = new TextField("b", null, 32, TextField.NUMERIC);//GEN-LINE:|119-getter|1|119-postInit
            // write post-init user code here
            }//GEN-BEGIN:|119-getter|2|
            return textField7;
        }
        //</editor-fold>//GEN-END:|119-getter|2|

        //<editor-fold defaultstate="collapsed" desc=" Generated Getter: textField8 ">//GEN-BEGIN:|120-getter|0|120-preInit
        /**
         * Returns an initiliazed instance of textField8 component.
         * @return the initialized component instance
         */
        public TextField getTextField8() {
            if (textField8 == null) {//GEN-END:|120-getter|0|120-preInit
            // write pre-init user code here
                textField8 = new TextField("x", null, 32, TextField.ANY | TextField.UNEDITABLE);//GEN-LINE:|120-getter|1|120-postInit
            // write post-init user code here
            }//GEN-BEGIN:|120-getter|2|
            return textField8;
        }
        //</editor-fold>//GEN-END:|120-getter|2|

        //<editor-fold defaultstate="collapsed" desc=" Generated Getter: textField9 ">//GEN-BEGIN:|121-getter|0|121-preInit
        /**
         * Returns an initiliazed instance of textField9 component.
         * @return the initialized component instance
         */
        public TextField getTextField9() {
            if (textField9 == null) {//GEN-END:|121-getter|0|121-preInit
            // write pre-init user code here
                textField9 = new TextField("a1x", null, 32, TextField.NUMERIC);//GEN-LINE:|121-getter|1|121-postInit
            // write post-init user code here
            }//GEN-BEGIN:|121-getter|2|
            return textField9;
        }
        //</editor-fold>//GEN-END:|121-getter|2|

        //<editor-fold defaultstate="collapsed" desc=" Generated Getter: textField10 ">//GEN-BEGIN:|122-getter|0|122-preInit
        /**
         * Returns an initiliazed instance of textField10 component.
         * @return the initialized component instance
         */
        public TextField getTextField10() {
            if (textField10 == null) {//GEN-END:|122-getter|0|122-preInit
            // write pre-init user code here
                textField10 = new TextField("b1y", null, 32, TextField.NUMERIC);//GEN-LINE:|122-getter|1|122-postInit
            // write post-init user code here
            }//GEN-BEGIN:|122-getter|2|
            return textField10;
        }
        //</editor-fold>//GEN-END:|122-getter|2|

        //<editor-fold defaultstate="collapsed" desc=" Generated Getter: textField11 ">//GEN-BEGIN:|123-getter|0|123-preInit
        /**
         * Returns an initiliazed instance of textField11 component.
         * @return the initialized component instance
         */
        public TextField getTextField11() {
            if (textField11 == null) {//GEN-END:|123-getter|0|123-preInit
            // write pre-init user code here
                textField11 = new TextField("c1", null, 32, TextField.NUMERIC);//GEN-LINE:|123-getter|1|123-postInit
            // write post-init user code here
            }//GEN-BEGIN:|123-getter|2|
            return textField11;
        }
        //</editor-fold>//GEN-END:|123-getter|2|

        //<editor-fold defaultstate="collapsed" desc=" Generated Getter: textField12 ">//GEN-BEGIN:|124-getter|0|124-preInit
        /**
         * Returns an initiliazed instance of textField12 component.
         * @return the initialized component instance
         */
        public TextField getTextField12() {
            if (textField12 == null) {//GEN-END:|124-getter|0|124-preInit
            // write pre-init user code here
                textField12 = new TextField("a2x", null, 32, TextField.NUMERIC);//GEN-LINE:|124-getter|1|124-postInit
            // write post-init user code here
            }//GEN-BEGIN:|124-getter|2|
            return textField12;
        }
        //</editor-fold>//GEN-END:|124-getter|2|

        //<editor-fold defaultstate="collapsed" desc=" Generated Getter: textField13 ">//GEN-BEGIN:|125-getter|0|125-preInit
        /**
         * Returns an initiliazed instance of textField13 component.
         * @return the initialized component instance
         */
        public TextField getTextField13() {
            if (textField13 == null) {//GEN-END:|125-getter|0|125-preInit
            // write pre-init user code here
                textField13 = new TextField("b2y", null, 32, TextField.NUMERIC);//GEN-LINE:|125-getter|1|125-postInit
            // write post-init user code here
            }//GEN-BEGIN:|125-getter|2|
            return textField13;
        }
        //</editor-fold>//GEN-END:|125-getter|2|

        //<editor-fold defaultstate="collapsed" desc=" Generated Getter: textField14 ">//GEN-BEGIN:|126-getter|0|126-preInit
        /**
         * Returns an initiliazed instance of textField14 component.
         * @return the initialized component instance
         */
        public TextField getTextField14() {
            if (textField14 == null) {//GEN-END:|126-getter|0|126-preInit
            // write pre-init user code here
                textField14 = new TextField("c2", null, 32, TextField.NUMERIC);//GEN-LINE:|126-getter|1|126-postInit
            // write post-init user code here
            }//GEN-BEGIN:|126-getter|2|
            return textField14;
        }
        //</editor-fold>//GEN-END:|126-getter|2|

        //<editor-fold defaultstate="collapsed" desc=" Generated Getter: textField15 ">//GEN-BEGIN:|127-getter|0|127-preInit
        /**
         * Returns an initiliazed instance of textField15 component.
         * @return the initialized component instance
         */
        public TextField getTextField15() {
            if (textField15 == null) {//GEN-END:|127-getter|0|127-preInit
            // write pre-init user code here
                textField15 = new TextField("x", null, 32, TextField.ANY | TextField.UNEDITABLE);//GEN-LINE:|127-getter|1|127-postInit
            // write post-init user code here
            }//GEN-BEGIN:|127-getter|2|
            return textField15;
        }
        //</editor-fold>//GEN-END:|127-getter|2|

        //<editor-fold defaultstate="collapsed" desc=" Generated Getter: textField16 ">//GEN-BEGIN:|128-getter|0|128-preInit
        /**
         * Returns an initiliazed instance of textField16 component.
         * @return the initialized component instance
         */
        public TextField getTextField16() {
            if (textField16 == null) {//GEN-END:|128-getter|0|128-preInit
            // write pre-init user code here
                textField16 = new TextField("y", null, 32, TextField.ANY | TextField.UNEDITABLE);//GEN-LINE:|128-getter|1|128-postInit
            // write post-init user code here
            }//GEN-BEGIN:|128-getter|2|
            return textField16;
        }
        //</editor-fold>//GEN-END:|128-getter|2|

        //<editor-fold defaultstate="collapsed" desc=" Generated Getter: okCommand3 ">//GEN-BEGIN:|129-getter|0|129-preInit
        /**
         * Returns an initiliazed instance of okCommand3 component.
         * @return the initialized component instance
         */
        public Command getOkCommand3() {
            if (okCommand3 == null) {//GEN-END:|129-getter|0|129-preInit
            // write pre-init user code here
                okCommand3 = new Command("Ok", Command.OK, 0);//GEN-LINE:|129-getter|1|129-postInit
            // write post-init user code here
            }//GEN-BEGIN:|129-getter|2|
            return okCommand3;
        }
        //</editor-fold>//GEN-END:|129-getter|2|

        //<editor-fold defaultstate="collapsed" desc=" Generated Getter: exitCommand3 ">//GEN-BEGIN:|131-getter|0|131-preInit
        /**
         * Returns an initiliazed instance of exitCommand3 component.
         * @return the initialized component instance
         */
        public Command getExitCommand3() {
            if (exitCommand3 == null) {//GEN-END:|131-getter|0|131-preInit
            // write pre-init user code here
                exitCommand3 = new Command("Exit", Command.EXIT, 0);//GEN-LINE:|131-getter|1|131-postInit
            // write post-init user code here
            }//GEN-BEGIN:|131-getter|2|
            return exitCommand3;
        }
        //</editor-fold>//GEN-END:|131-getter|2|

    public Display getDisplay() {
        return Display.getDisplay(this);
    }

    public void exitMIDlet() {
        switchDisplayable(null, null);
        destroyApp(true);
        notifyDestroyed();
    }

    public void startApp() {
        if (midletPaused) {
            resumeMIDlet();
        } else {
            initialize();
            startMIDlet();
        }
        midletPaused = false;
    }

    public void pauseApp() {
        midletPaused = true;
    }

    public void destroyApp(boolean unconditional) {
    }
}
