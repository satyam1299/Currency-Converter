import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.DecimalFormat;

import javax.swing.*;

public class CurrencyConvertor{
    
    public static void main(String[] args) {
        /*
         * F R A M E   I N I T I A L I Z A T I O N
         */
        JFrame frame = new JFrame("Currency Calculator");

        // JPanel panel = new JPanel();
        // panel.setLayout(new FlowLayout());

        /*
         * sets title bar icon
         */
        // Image icon = Toolkit.getDefaultToolkit().getImage("https://www.google.com/imgres?imgurl=https%3A%2F%2Fimage.similarpng.com%2Fvery-thumbnail%2F2020%2F11%2FCurrency-exchange-dollar-and-euro-on-transparent-background-PNG.png&tbnid=R7h4_fDUrBliiM&vet=12ahUKEwie8_yilf2AAxVb5jgGHaZGAjYQMygBegQIARB2..i&imgrefurl=https%3A%2F%2Fsimilarpng.com%2Fcurrency-exchange-dollar-and-euro-on-transparent-background-png%2F&docid=HTL_WDMZvuFukM&w=600&h=545&q=currency%20exchange%20without%20background&ved=2ahUKEwie8_yilf2AAxVb5jgGHaZGAjYQMygBegQIARB2");
        // frame.setIconImage(icon);

        /*
         * H E A D I N G
         */
        JLabel label = new JLabel("Check live rates");
        label.setBounds(170, 70, 200, 30); 
        frame.add(label);
        label.setFont(new java.awt.Font("Arial", Font.BOLD, 20));


        /*
         * I N P U T   F R O M   U S E R
         */
        JLabel label3 =new JLabel("<html><h3><em>From</em></h3></html>");
        label3.setBounds(40, 150, 70, 30);
        frame.add(label3);

        JTextField textField = new JTextField(10);
        textField.setBounds(100, 150, 110, 30);  
        frame.add(textField);

        /*
         * setting tooltip text for JTextField
         */
        // textField.setToolTipText("<html><b><font color=red>"+ "Please enter a valid amount" +"</font></b></html>");
        textField.setFont(new java.awt.Font("Arial", Font.BOLD, 18));
        textField.setForeground(Color.DARK_GRAY);
        textField.setBackground(Color.yellow);

        String input[] = {"Australian Dollar", "Bangladeshi Taka", "Canadian Dollar", "Egyptian Pound", "Euro", "Indian Rupee", "Iranian Rial", "Israeli New Shekel", "Japanese Yen", "Kuwaiti Dinar", "Napalese Rupee", "Pakistani Rupee", "Russian Ruble", "Saudi Riyal", "South African Rand", "United States Dollar"};
        // String input[][] = {{"Australian Dollar", "../a Programs/Project 01 - Currency Convertor/Images/australia.png"}, {"Bangladeshi Taka", ""}, {"Canadian Dollar", ""}, {"Egyptian Pound", ""}, {"Euro", ""}, {"Indian Rupee", ""}, {"Iraian Rial", ""}, {"Israeli New Shekel", ""}, {"Japanese Yen", ""}, {"Kuwaiti Dinar", ""}, {"Napalese Rupee", ""}, {"Pakistani Rupee", ""}, {"Russian Ruble", ""}, {"Saudi Riyal", ""}, {"South African Rand", ""}, {"United States Dollar",""}};
        JComboBox<String> option1 = new JComboBox<>(input);
        option1.setBounds(250, 150, 200, 30);
        frame.add(option1);

        JLabel label2 = new JLabel();
        label2.setBounds(100, 100, 100, 30);


        /*
         * O U T P U T  
         */
        JLabel label4 =new JLabel("<html><h3><em>To</em></h3></html>");
        label4.setBounds(40, 200, 70, 30);
        frame.add(label4);

        JTextField textField2 = new JTextField(10);
        textField2.setBounds(100, 200, 110, 30);
        frame.add(textField2);
        textField2.setEditable(false); //set the output text field to be non-editable
        textField2.setFont(new java.awt.Font("Arial", Font.BOLD, 22));
        textField2.setForeground(Color.BLUE);
        textField2.setBackground(Color.white);

        String output[] = {"Australian Dollar", "Bangladeshi Taka", "Canadian Dollar", "Egyptian Pound", "Euro", "Indian Rupee", "Iranian Rial", "Israeli New Shekel", "Japanese Yen", "Kuwaiti Dinar", "Napalese Rupee", "Pakistani Rupee", "Russian Ruble", "Saudi Riyal", "South African Rand", "United States Dollar"};
        JComboBox<String> option2 = new JComboBox<>(output);
        option2.setBounds(250, 200, 200, 30);
        frame.add(option2);


        /*
         * C A L C U L A T E   B U T T O N
         */
        JButton equal = new JButton("<html><h2>Calculate</h2></html>");
        equal.setBounds(163, 250, 180, 50);
        frame.add(equal);
        equal.setBackground(Color.RED);
        equal.setForeground(Color.WHITE);
        // equal.addActionListener(this);
        // equal.setForeground("GREEN");
        

        /*
         * A D D I N G   A C T I O N   L I S T E N E R
         */
        equal.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent event) {
                // String value = textField.getText();//get text(in String format) from JTextField
                // int amount = Integer.parseInt(value); //convert input String to integer
                double amount = Double.parseDouble(textField.getText());
                String userCurrType = (String) option1.getSelectedItem();
                String outputCurrType = (String) option2.getSelectedItem();

                DecimalFormat decFormat = new DecimalFormat("#.00");

                double conversionRate = 0.0; //initialising conversion rate
                try {
                    // M E T H O D   1
                    // if(("Australian Dollar".equals(userCurrType)) && ("Bangladeshi Taka".equals(outputCurrType))) {
                    // }

                    // M E T H O D   2
                    // if("Australian Dollar".equals(userCurrType)) {
                    //     switch(outputCurrType) {
                    //         case "Euro":
                    //             conversionRate = 0.59;
                    //             break;
                    //         case "Indian Rupee":
                    //             conversionRate = 52.97;
                    //             break; 
                    //         default:
                    //             label2.setText("<html><font color=red size=4><b>Please enter some value!</b></html>");
                    //     } 
                    // }

                    // M E T H O D   3
                    // if("Canadian Dollar".equals(outputCurrType)) {
                    //     double totalAmt = amount * 0.87;
                    //     textField2.setText(String.valueOf(totalAmt)); 
                    // } else if("Egyptian Pound".equals(outputCurrType)) {
                    //     double totalAmt = amount * 19.82;
                    //     textField2.setText(String.valueOf(totalAmt)); 
                    // } else if("Euro".equals(outputCurrType)) {
                    //     double totalAmt = amount * 0.59;
                    //     textField2.setText(String.valueOf(totalAmt)); 
                    // }
                    switch(userCurrType) {
                        case "Australian Dollar":
                            conversionRate = getConversionRateForAustralianDollar(outputCurrType);
                            break;
                        case "Bangladeshi Taka":
                            conversionRate = getConversionRateForBangladeshiTaka(outputCurrType);
                            break;
                        case "Canadian Dollar":
                            conversionRate = getConversionRateForCanadianDollar(outputCurrType);
                            break;
                        case "Egyptian Pound":
                            conversionRate = getConversionRateForEgyptianPound(outputCurrType);
                            break;
                        case "Euro":
                            conversionRate = getConversionRateForEuro(outputCurrType);
                            break;
                        case "Indian Rupee":
                            conversionRate = getConversionRateForIndianRupee(outputCurrType);
                            break;
                        case "Iranian Rial":
                            conversionRate = getConversionRateForIranianRial(outputCurrType);
                            break;
                        case "Israeli New Shekel":
                            conversionRate = getConversionRateForIsraeliNewShekel(outputCurrType);
                            break;
                        case "Japanese Yen":
                            conversionRate = getConversionRateForJapaneseYen(outputCurrType);
                            break;
                        case "Kuwaiti Dinar":
                            conversionRate = getConversionRateForKuwaitiDinar(outputCurrType);
                            break;
                        case "Nepalese Rupee":
                            conversionRate = getConversionRateForNepaleseRupee(outputCurrType);
                            break;
                        case "Pakistani Rupee":
                            conversionRate = getConversionRateForPakistaniRupee(outputCurrType);
                            break;
                        case "Russian Ruble":
                            conversionRate = getConversionRateForRussianRuble(outputCurrType);
                            break;
                        case "Saudi Riyal":
                            conversionRate = getConversionRateForSaudiRiyal(outputCurrType);
                            break;
                        case "South African Rand":
                            conversionRate = getConversionRateForSouthAfricanRand(outputCurrType);
                            break;
                        case "United States Dollar":
                            conversionRate = getConversionRateForUnitedStatesDollar(outputCurrType);
                            break;
                        default:
                            label2.setText("<html><font color=red size=4><b>Please enter some value!</b></html>");
                    }
                    double totalAmt = amount * conversionRate;
                    textField2.setText(decFormat.format(totalAmt));

                } catch(NumberFormatException e) {
                    System.out.println("Invalid format!");
                } catch(Exception e1) {
                    System.out.println("Invalid Choice!");
                }
            }

            /*
             * C O N V E R S I O N   F O R   A U S T R A L I A N   D O L L A R
             */
            private double getConversionRateForAustralianDollar(String outputCurrType) {
                switch(outputCurrType) {
                    case "Bangladeshi Taka":
                        return 70.01;
                    case "Canadian Dollar":
                        return 0.87;
                    case "Egyptian Pound":
                        return 19.82;
                    case "Euro":
                        return 0.59;
                    case "Indian Rupee":
                        return 52.97;
                    case "Iraian Rial":
                        return 27098.91;
                    case "Israeli New Shekel":
                        return 2.43;
                    case "Japanese Yen":
                        return 93.91;
                    case "Kuwaiti Dinar":
                        return 0.20;
                    case "Napalese Rupee":
                        return 84.79;
                    case "Pakistani Rupee":
                        return 194.23;
                    case "Russian Ruble":
                        return 61.10;
                    case "Saudi Riyal":
                        return 2.40;
                    case "South African Rand":
                        return 11.98;
                    case "United States Dollar":
                        return 0.64;
                    default:
                        return 0.0;
                } 
            }

            /*
             * C O N V E R S I O N   F O R   B A B G L A D E S H I   T A K A
             */
            private double getConversionRateForBangladeshiTaka(String outputCurrType) {
                switch(outputCurrType) {
                    case "Australian Dollar":
                        return 0.014;
                    case "Canadian Dollar":
                        return 0.012;
                    case "Egyptian Pound":
                        return 0.28;
                    case "Euro":
                        return 0.0085;
                    case "Indian Rupee":
                        return 0.76;
                    case "Iraian Rial":
                        return 387.00;
                    case "Israeli New Shekel":
                        return 0.035;
                    case "Japanese Yen":
                        return 1.34;
                    case "Kuwaiti Dinar":
                        return 0.0028;
                    case "Napalese Rupee":
                        return 1.21;
                    case "Pakistani Rupee":
                        return 2.78;
                    case "Russian Ruble":
                        return 0.87;
                    case "Saudi Riyal":
                        return 0.034;
                    case "South African Rand":
                        return 0.17;
                    case "United States Dollar":
                        return 0.0092;
                    default:
                        return 0.0;
                } 
            }

            /*
             * C O N V E R S I O N   F O R   C A N A D I A N   D O L L A R
             */
            private double getConversionRateForCanadianDollar(String outputCurrType) {
                switch(outputCurrType) {
                    case "Australian Dollar":
                        return 1.15;
                    case "Bangladeshi Taka":
                        return 80.45;
                    case "Egyptian Pound":
                        return 22.75;
                    case "Euro":
                        return 0.68;
                    case "Indian Rupee":
                        return 60.83;
                    case "Iraian Rial":
                        return 31127.08;
                    case "Israeli New Shekel":
                        return 2.80;
                    case "Japanese Yen":
                        return 107.94;
                    case "Kuwaiti Dinar":
                        return 0.23;
                    case "Napalese Rupee":
                        return 97.37;
                    case "Pakistani Rupee":
                        return 223.53;
                    case "Russian Ruble":
                        return 70.36;
                    case "Saudi Riyal":
                        return 2.76;
                    case "South African Rand":
                        return 13.69;
                    case "United States Dollar":
                        return 0.74;
                    default:
                       return 0.0;
                }
            }

            /*
             * C O N V E R S I O N   F O R   E G Y P T I A N   P O U N D
             */
            private double getConversionRateForEgyptianPound(String outputCurrType) {
                switch(outputCurrType) {
                    case "Australian Dollar":
                        return 0.050;
                    case "Bangladeshi Taka":
                        return 3.54;
                    case "Canadian Dollar":
                        return 0.044;
                    case "Euro":
                        return 0.030;
                    case "Indian Rupee":
                        return 2.67;
                    case "Iraian Rial":
                        return 1367.81;
                    case "Israeli New Shekel":
                        return 0.12;
                    case "Japanese Yen":
                        return 4.74;
                    case "Kuwaiti Dinar":
                        return 0.0100;
                    case "Napalese Rupee":
                        return 4.28;
                    case "Pakistani Rupee":
                        return 9.82;
                    case "Russian Ruble":
                        return 3.06;
                    case "Saudi Riyal":
                        return 0.12;
                    case "South African Rand":
                        return 0.60;
                    case "United States Dollar":
                        return 0.032;
                    default:
                        return 0.0;
                }
            }

            /*
             * C O N V E R S I O N   F O R   E U R O
             */
            private double getConversionRateForEuro(String outputCurrType) {
                switch(outputCurrType) {
                    case "Australian Dollar":
                        return 1.68;
                    case "Bangladeshi Taka":
                        return 118.06;
                    case "Canadian Dollar":
                        return 1.47;
                    case "Egyptian Pound":
                        return 33.39;
                    case "Indian Rupee":
                        return 89.28;
                    case "Iraian Rial":
                        return 45676.87;
                    case "Israeli New Shekel":
                        return 4.11;
                    case "Japanese Yen":
                        return 158.46;
                    case "Kuwaiti Dinar":
                        return 0.33;
                    case "Napalese Rupee":
                        return 142.86;
                    case "Pakistani Rupee":
                        return 327.97;
                    case "Russian Ruble":
                        return 103.24;
                    case "Saudi Riyal":
                        return 4.05;
                    case "South African Rand":
                        return 20.11;
                    case "United States Dollar":
                        return 1.08;
                    default:
                        return 0.0;
                }
            }

            /*
             * C O N V E R S I O N   F O R   I N D I A N   R U P E E
             */
            private double getConversionRateForIndianRupee(String outputCurrType) {
                switch(outputCurrType) {
                    case "Australian Dollar":
                        return 0.019;
                    case "Bangladeshi Taka":
                        return 1.32;
                    case "Canadian Dollar":
                        return 0.016;
                    case "Egyptian Pound":
                        return 0.37;
                    case "Euro":
                        return 0.011;
                    case "Iraian Rial":
                        return 511.66;
                    case "Israeli New Shekel":
                        return 0.046;
                    case "Japanese Yen":
                        return 1.78;
                    case "Kuwaiti Dinar":
                        return 0.0037;
                    case "Napalese Rupee":
                        return 1.60;
                    case "Pakistani Rupee":
                        return 3.67;
                    case "Russian Ruble":
                        return 1.16;
                    case "Saudi Riyal":
                        return 0.045;
                    case "South African Rand":
                        return 0.23;
                    case "United States Dollar":
                        return 0.012;
                    default:
                        return 0.0;
                }
            }

            /*
             * C O N V E R S I O N   F O R   I R A N I A N   R I A L
             */
            private double getConversionRateForIranianRial(String outputCurrType) {
                switch(outputCurrType) {
                    case "Australian Dollar":
                        return 0.000037;
                    case "Bangladeshi Taka":
                        return 0.0026;
                    case "Canadian Dollar":
                        return 0.000032;
                    case "Egyptian Pound":
                        return 0.00073;
                    case "Euro":
                        return 0.000022;
                    case "Indian Rupee":
                        return 0.0020;
                    case "Israeli New Shekel":
                        return 0.000090;
                    case "Japanese Yen":
                        return 0.0035;
                    case "Kuwaiti Dinar":
                        return 0.0000073;
                    case "Napalese Rupee":
                        return 0.0031;
                    case "Pakistani Rupee":
                        return 0.0072;
                    case "Russian Ruble":
                        return 0.0023;
                    case "Saudi Riyal":
                        return 0.000089;
                    case "South African Rand":
                        return 0.00044;
                    case "United States Dollar":
                        return 0.000024;
                    default:
                        return 0.0;
                }
            }

            /*
             * C O N V E R S I O N   F O R   I S R A E L I   N E W   S H E K E L
             */
            private double getConversionRateForIsraeliNewShekel(String outputCurrType) {
                switch(outputCurrType) {
                    case "Australian Dollar":
                        return 0.41;
                    case "Bangladeshi Taka":
                        return 28.73;
                    case "Canadian Dollar":
                        return 0.36;
                    case "Egyptian Pound":
                        return 8.12;
                    case "Euro":
                        return 0.24;
                    case "Indian Rupee":
                        return 21.73;
                    case "Iraian Rial":
                        return 11114.53;
                    case "Japanese Yen":
                        return 38.50;
                    case "Kuwaiti Dinar":
                        return 0.081;
                    case "Napalese Rupee":
                        return 34.76;
                    case "Pakistani Rupee":
                        return 79.80;
                    case "Russian Ruble":
                        return 24.85;
                    case "Saudi Riyal":
                        return 0.99;
                    case "South African Rand":
                        return 4.88;
                    case "United States Dollar":
                        return 0.26;
                    default:
                        return 0.0;
                }
            }

            /*
             * C O N V E R S I O N   F O R   J A P A N E S E   Y E N
             */
            private double getConversionRateForJapaneseYen(String outputCurrType) {
                switch(outputCurrType) {
                    case "Australian Dollar":
                        return 0.011;
                    case "Bangladeshi Taka":
                        return 0.75;
                    case "Canadian Dollar":
                        return 0.0093;
                    case "Egyptian Pound":
                        return 0.21;
                    case "Euro":
                        return 0.0063;
                    case "Indian Rupee":
                        return 0.56;
                    case "Iraian Rial":
                        return 288.72;
                    case "Israeli New Shekel":
                        return 0.026;
                    case "Kuwaiti Dinar":
                        return 0.0021;
                    case "Napalese Rupee":
                        return 0.90;
                    case "Pakistani Rupee":
                        return 2.07;
                    case "Russian Ruble":
                        return 0.65;
                    case "Saudi Riyal":
                        return 0.026;
                    case "South African Rand":
                        return 0.13;
                    case "United States Dollar":
                        return 0.0068;
                    default:
                        return 0.0;
                }
            }

            /*
             * C O N V E R S I O N   F O R   K U W A I T I   D I N A R
             */
            private double getConversionRateForKuwaitiDinar(String outputCurrType) {
                switch(outputCurrType) {
                    case "Australian Dollar":
                        return 5.04;
                    case "Bangladeshi Taka":
                        return 354.20;
                    case "Canadian Dollar":
                        return 4.41;
                    case "Egyptian Pound":
                        return 100.17;
                    case "Euro":
                        return 3.00;
                    case "Indian Rupee":
                        return 267.93;
                    case "Iraian Rial":
                        return 137045.07;
                    case "Israeli New Shekel":
                        return 12.33;
                    case "Napalese Rupee":
                        return 428.63;
                    case "Pakistani Rupee":
                        return 971.77;
                    case "Russian Ruble":
                        return 306.35;
                    case "Saudi Riyal":
                        return 12.16;
                    case "South African Rand":
                        return 60.18;
                    case "United States Dollar":
                        return 3.24;
                    default:
                        return 0.0;
                }
            }

            /*
             * C O N V E R S I O N   F O R   N E P A L E S E   R U P E E
             */
            private double getConversionRateForNepaleseRupee(String outputCurrType) {
                switch(outputCurrType) {
                    case "Australian Dollar":
                        return 0.012;
                    case "Bangladeshi Taka":
                        return 0.83;
                    case "Canadian Dollar":
                        return 0.010;
                    case "Egyptian Pound":
                        return 0.23;
                    case "Euro":
                        return 0.0070;
                    case "Indian Rupee":
                        return 0.63;
                    case "Iraian Rial":
                        return 319.77;
                    case "Israeli New Shekel":
                        return 0.029;
                    case "Kuwaiti Dinar":
                        return 0.0023;
                    case "Pakistani Rupee":
                        return 2.30;
                    case "Russian Ruble":
                        return 0.71;
                    case "Saudi Riyal":
                        return 0.028;
                    case "South African Rand":
                        return 0.14;
                    case "United States Dollar":
                        return 0.0076;
                    default:
                        return 0.0;
                }
            }


            /*
             * C O N V E R S I O N   F O R   P A K I S T A N I   R U P E E
             */
            private double getConversionRateForPakistaniRupee(String outputCurrType) {
                switch(outputCurrType) {
                    case "Australian Dollar":
                        return 0.0051;
                    case "Bangladeshi Taka":
                        return 0.36;
                    case "Canadian Dollar":
                        return 0.0045;
                    case "Egyptian Pound":
                        return 0.10;
                    case "Euro":
                        return 0.0030;
                    case "Indian Rupee":
                        return 0.27;
                    case "Iraian Rial":
                        return 139.28;
                    case "Israeli New Shekel":
                        return 0.013;
                    case "Kuwaiti Dinar":
                        return 0.0010;
                    case "Napalese Rupee":
                        return 0.44;
                    case "Russian Ruble":
                        return 0.31;
                    case "Saudi Riyal":
                        return 0.012;
                    case "South African Rand":
                        return 0.061;
                    case "United States Dollar":
                        return 0.0033;
                    default:
                        return 0.0;
                }
            }

            /*
             * C O N V E R S I O N   F O R   R U S S I A N   R U B E L
             */
            private double getConversionRateForRussianRuble(String outputCurrType) {
                switch(outputCurrType) {
                    case "Australian Dollar":
                        return 0.016;
                    case "Bangladeshi Taka":
                        return 1.16;
                    case "Canadian Dollar":
                        return 0.014;
                    case "Egyptian Pound":
                        return 0.33;
                    case "Euro":
                        return 0.0098;
                    case "Indian Rupee":
                        return 0.87;
                    case "Iraian Rial":
                        return 447.35;
                    case "Israeli New Shekel":
                        return 0.040;
                    case "Kuwaiti Dinar":
                        return 0.0033;
                    case "Napalese Rupee":
                        return 1.40;
                    case "Pakistani Rupee":
                        return 3.21;
                    case "Saudi Riyal":
                        return 0.040;
                    case "South African Rand":
                        return 0.20;
                    case "United States Dollar":
                        return 0.011;
                    default:
                        return 0.0;
                }
            }

            /*
             * C O N V E R S I O N   F O R   S A U D I   R I Y A L
             */
            private double getConversionRateForSaudiRiyal(String outputCurrType) {
                switch(outputCurrType) {
                    case "Australian Dollar":
                        return 0.41;
                    case "Bangladeshi Taka":
                        return 29.13;
                    case "Canadian Dollar":
                        return 0.36;
                    case "Egyptian Pound":
                        return 8.24;
                    case "Euro":
                        return 0.25;
                    case "Indian Rupee":
                        return 22.03;
                    case "Iraian Rial":
                        return 11269.51;
                    case "Israeli New Shekel":
                        return 1.01;
                    case "Kuwaiti Dinar":
                        return 0.082;
                    case "Napalese Rupee":
                        return 35.25;
                    case "Pakistani Rupee":
                        return 80.92;
                    case "Russian Ruble":
                        return 25.19;
                    case "South African Rand":
                        return 4.95;
                    case "United States Dollar":
                        return 0.27;
                    default:
                        return 0.0;
                }
            }

            /*
             * C O N V E R S I O N   F O R   S O U T H   A F R I C A N   R A N D
             */
            private double getConversionRateForSouthAfricanRand(String outputCurrType) {
                switch(outputCurrType) {
                    case "Australian Dollar":
                        return 0.084;
                    case "Bangladeshi Taka":
                        return 5.88;
                    case "Canadian Dollar":
                        return 0.073;
                    case "Egyptian Pound":
                        return 1.66;
                    case "Euro":
                        return 0.050;
                    case "Indian Rupee":
                        return 4.45;
                    case "Iraian Rial":
                        return 2275.70;
                    case "Israeli New Shekel":
                        return 0.20;
                    case "Kuwaiti Dinar":
                        return 0.017;
                    case "Napalese Rupee":
                        return 7.12;
                    case "Pakistani Rupee":
                        return 16.35;
                    case "Russian Ruble":
                        return 5.09;
                    case "Saudi Riyal":
                        return 0.20;
                    case "United States Dollar":
                        return 0.054;
                    default:
                        return 0.0;
                }
            }

            /*
             * C O N V E R S I O N   F O R   U N I T E D   S T A T E S   D O L L A R
             */
            private double getConversionRateForUnitedStatesDollar(String outputCurrType) {
                switch(outputCurrType) {
                    case "Australian Dollar":
                        return 1.56;
                    case "Bangladeshi Taka":
                        return 109.26;
                    case "Canadian Dollar":
                        return 1.36;
                    case "Egyptian Pound":
                        return 30.91;
                    case "Euro":
                        return 0.93;
                    case "Indian Rupee":
                        return 82.63;
                    case "Iraian Rial":
                        return 42275.00;
                    case "Israeli New Shekel":
                        return 3.80;
                    case "Kuwaiti Dinar":
                        return 0.31;
                    case "Napalese Rupee":
                        return 132.22;
                    case "Pakistani Rupee":
                        return 303.54;
                    case "Russian Ruble":
                        return 94.50;
                    case "Saudi Riyal":
                        return 3.75;
                    case "South African Rand":
                        return 18.58;
                    default:
                        return 0.0;
                }
            }
        });

        /*
         * F R A M E   S E T T I N G
         */
        frame.setSize(500, 400);
        frame.setLayout(null);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}