package deposit_screen;
import javax.swing.*;
import java.awt.*;
import javax.swing.border.*;
//import com.borland.jbcl.layout.*;

  public class depositmenu
  {
    static JFrame menu=new JFrame("The FirstMicroFinanceBank Ltd");

        public static void main(String args[]) {


                Font lableFonts=new Font("Arial",Font.BOLD,11);
                JTextField TransactionDate=new JTextField(14);
                JTextField TransactionNumber=new JTextField(14);
                JTextField TransactionType=new JTextField(14);
                JTextField Currency = new JTextField(13);
                JTextField TitleOfAccount= new JTextField(13);
                JTextField CustomerId = new JTextField(13);
                JTextField Customer= new JTextField(13);
                JTextField valueDate= new JTextField(13);

                JComboBox  Product=new JComboBox();
                JComboBox Scheme= new JComboBox();
                JComboBox Account = new JComboBox();
                JTextField Amount= new JTextField(14);
                JTextField Narration= new JTextField(14);

                JTextField AvailableBalance= new JTextField(14);
                JTextField Lien= new JTextField(14);
                JTextField OperatingInstructions= new JTextField(14);
                JTextField ShadowBalance= new JTextField(14);

                JLabel lblTransactionDate= new JLabel("Transaction Date");
                lblTransactionDate.setFont(lableFonts);

                JLabel lblTransactionNumber= new JLabel("Transaction Number");
                lblTransactionNumber.setFont(lableFonts);
                JLabel lblTransactionType= new JLabel("Transaction type");
                      //  lblTransactionType.setfo
                JLabel lblTitleOfAccount= new JLabel("Title of Account");
                JLabel lblCustomerId= new JLabel("customer Id");
                JLabel lblCustomer= new JLabel("Customer");
                JLabel lblCurrency= new JLabel("Currency");
                JLabel lblValueDate= new JLabel("Value Date");
              

                JLabel lblProduct= new JLabel("Product");
                JLabel lblScheme= new JLabel("Scheme");
                JLabel lblAccount= new JLabel("Account");
                JLabel lblAmount= new JLabel("Amount");
                JLabel lblNarration=new JLabel("Narration");

                JLabel lblAvailableBalance= new JLabel("Available Balance");
                JLabel lblLien= new JLabel("Lien/Hold");
                JLabel lblOperatingInstructions= new JLabel("Operating Instructions");
                JLabel lblShadowBalance=new JLabel("Shadow Balance");
              


                Icon bottomImage=new ImageIcon("BottomBar.gif");

                JLabel lblbottomImage=new JLabel(bottomImage);
                JPanel bottomImagePanel=new JPanel();
                bottomImagePanel.setBorder(new LineBorder(Color.gray));
                bottomImagePanel.add(lblbottomImage);



              
              JLabel lblSr= new JLabel("Sr.");
              lblSr.setBackground(Color.BLUE);
              lblSr.setForeground(Color.white);
              JLabel lblSignatureId=new JLabel("Signature id");
              JLabel lblName = new JLabel("Name");
              JLabel lblSignatureCombination= new JLabel("Signature Combination");
              JLabel lblCombId= new JLabel("CombId");


                GridBagConstraints c=new GridBagConstraints();
                GridBagLayout gl = new GridBagLayout();
                Color color=new Color(224,224,224);
                menu.getContentPane().setBackground(color);
                menu.getContentPane().setLayout(gl);
                menu.getContentPane().setFont(lableFonts);

                //JPanel MainPanel =new JPanel();

               // MainPanel.setBackground(Color.LIGHT_gray);
                //MainPanel.add(DepositEntry);


                JPanel TopPanel = new JPanel(new GridLayout(3,3,5,5));/*() );*/
               // Dimension d=new Dimension(1010,300);
                    //   TopPanel.setPreferredSize(d);
                           //JPanel MainPanel =new JPanel();

              
                     // TopPanel.add(TopLabelPanel);



              TopPanel.add(lblTransactionDate);
              TopPanel.add(TransactionDate);
              TopPanel.add(lblTransactionNumber);
              TopPanel.add(TransactionNumber);
              TopPanel.add(lblTransactionType);
              TopPanel.add(TransactionType);
              TopPanel.add(lblTitleOfAccount);
              TopPanel.add(TitleOfAccount);
              TopPanel.add(lblCustomerId);
              TopPanel.add(CustomerId);
              TopPanel.add(lblCustomer);
              TopPanel.add(Customer);
              TopPanel.add(lblCurrency);
              TopPanel.add(Currency);
              TopPanel.add(lblValueDate);
              TopPanel.add(valueDate);

       TopPanel.setBorder(new TitledBorder(new LineBorder(Color.gray),"Detail"));
       TopPanel.setBackground(new Color(224,224,224));


       JPanel MiddlePanel = new JPanel(new GridLayout(3,2,3,10));


                     MiddlePanel.add(lblProduct);
                    MiddlePanel.add(Product);

                    MiddlePanel.add(lblScheme);
                    MiddlePanel.add(Scheme);

                     MiddlePanel.add(lblAccount);
                     MiddlePanel.add(Account);

                     MiddlePanel.add(lblAmount);
                     MiddlePanel.add(Amount);

                     MiddlePanel.add(lblNarration);
                     MiddlePanel.add(Narration);

                     MiddlePanel.setBorder(new TitledBorder(new LineBorder(Color.gray),"Detail"));
                     MiddlePanel.setBackground(new Color(224,224,224));

                     JPanel EnquiriesPanel = new JPanel(new GridLayout(5,2,1,10));

                 EnquiriesPanel.add(lblAvailableBalance);
                EnquiriesPanel.add(AvailableBalance);

                 EnquiriesPanel.add(lblLien);
                 EnquiriesPanel.add(Lien);

                  EnquiriesPanel.add(lblOperatingInstructions);
                 EnquiriesPanel.add(OperatingInstructions);

                  EnquiriesPanel.add(lblShadowBalance);
                  EnquiriesPanel.add(ShadowBalance);

              EnquiriesPanel.setBorder(new TitledBorder(new LineBorder(Color.gray),"Enquiries"));
              EnquiriesPanel.setBackground(new Color(224,224,224));

             /*
              JPanel SignatoriesTopPanel=new JPanel();
              SignatoriesTopPanel.add(lblSignatories);
             SignatoriesTopPanel.setBorder(new  LineBorder(Color.gray));
             */

              JPanel SignatoriesPanel = new JPanel(new GridLayout(2,3,1,10));

            //   SignatoriesPanel.add(SignatoriesTopPanel);
                SignatoriesPanel.add(lblSr);
                SignatoriesPanel.add(lblSignatureId);
                SignatoriesPanel.add(lblName);
                SignatoriesPanel.setBorder(new TitledBorder(new LineBorder(Color.gray)));
               SignatoriesPanel.setBackground(new Color(224,224,224));




              JPanel SignatureCombinationPanel = new JPanel(new FlowLayout());

                           SignatureCombinationPanel.add(lblSignatureCombination);
                           SignatureCombinationPanel.add(lblCombId);
                           SignatureCombinationPanel.add(lblSr);
                           SignatureCombinationPanel.add(lblSignatureId);
                           SignatureCombinationPanel.setBorder(new TitledBorder(new LineBorder(Color.gray)));
                           SignatureCombinationPanel.setBackground(new Color(224,224,224));



           JPanel SignaturePanel = new JPanel(new GridLayout(2,1,3,2));
              Icon ico=new ImageIcon("more.gif");
              JLabel signature=new JLabel(ico,SwingConstants.LEFT);
              SignaturePanel.add(signature);
              SignaturePanel.setBorder(new TitledBorder(new LineBorder(Color.gray) ,"Signature"));
              SignaturePanel.setBackground(new Color(224,224,224));

                JPanel TopLabelPanel =new JPanel();
                TopLabelPanel.setLayout(new FlowLayout(SwingConstants.TOP));
                JLabel TopLabel =new JLabel("Deposit Entry");
                TopLabelPanel.add(TopLabel);

                Insets boundaries=new Insets(10,10,10,20);
                                  c.gridx=0;
                                  c.gridy=0;
                                  c.gridwidth=3;
                                  c.gridheight=1;
                                  c.insets=boundaries;
                                  c.anchor=GridBagConstraints.FIRST_LINE_START;
                                  c.fill=GridBagConstraints.HORIZONTAL;
                                  c.weightx=1;
                                  c.weighty=1;
                                  gl.setConstraints(TopLabelPanel,c);
                                  menu.getContentPane().add(TopLabelPanel);



                     c.gridx=0;
                     c.gridy=1;
                     c.gridwidth=3;
                     c.gridheight=1;
      //               c.anchor=GridBagConstraints.LINE_START;
                     c.fill=GridBagConstraints.HORIZONTAL;
                    // c.weightx=0;
                    // c.weighty=3;
                     gl.setConstraints(TopPanel,c);
                     menu.getContentPane().add(TopPanel);
                     JPanel lblPanel = new JPanel();
                     JLabel lblDeposit=new JLabel("Deposit Entry");
                     lblPanel.add(lblDeposit);
                     //lblPanel.setBorder(new LineBorder(Color.gray));

                    c.gridx=0;
                    c.gridy=2;
                    c.gridwidth=2;
                    c.gridheight=1;
    //                c.anchor=GridBagConstraints.LINE_START;
                    c.fill=GridBagConstraints.HORIZONTAL;
                    gl.setConstraints(lblPanel,c);
                    menu.getContentPane().add(lblPanel);


                    JPanel panelEnquiry = new JPanel();
                    JLabel lblEnquiry=new JLabel("Enquiries");
                    panelEnquiry.add(lblEnquiry);
                    //lblPanel.setBorder(new LineBorder(Color.gray));

                   c.gridx=2;
                   c.gridy=2;
                   c.gridwidth=1;
                   c.gridheight=1;
  //                 c.anchor=GridBagConstraints.LINE_START;
                   c.fill=GridBagConstraints.HORIZONTAL;
                   gl.setConstraints(panelEnquiry,c);
                   menu.getContentPane().add(panelEnquiry);


                     c.gridx = 0;
                     c.gridy = 3;
                     c.gridwidth = 2;
                     c.gridheight =2;
                     //c.weightx = 1;
                     //c.weighty = 1;
                     c.fill = GridBagConstraints.HORIZONTAL;
//                     c.anchor=GridBagConstraints.LINE_START;
                     gl.setConstraints(MiddlePanel, c);
                     menu.getContentPane().add(MiddlePanel);



                     c.gridx=2;
                     c.gridy=3;
                     c.gridwidth=1;
                     c.gridheight=1;
                     // c.weightx=1;
                     // c.weighty=0;
                     //c.fill=GridBagConstraint;
                     c.fill=GridBagConstraints.HORIZONTAL;
                     gl.setConstraints(EnquiriesPanel,c);
                     menu.getContentPane().add(EnquiriesPanel);


                     JPanel PanelSignature=new JPanel();
                     JLabel labelSignature=new JLabel("Signature");
                     PanelSignature.add(labelSignature);


                     c.gridx = 2;
                     c.gridy = 4;
                     c.gridwidth = 1;
                     c.gridheight =1;
                     //c.weightx = 1;
                     //c.weighty = 1;
//                     c.fill = GridBagConstraints.BOTH;
        //             c.anchor=GridBagConstraints.FIRST_LINE_START;
                     gl.setConstraints(PanelSignature, c);
                     menu.getContentPane().add(PanelSignature);


                      JPanel PanelSignatories = new JPanel();
                     JLabel lblSignatories1=new JLabel("Signatories");
                     PanelSignatories.add(lblSignatories1);
                   //lblPanel.setBorder(new LineBorder(Color.gray));


                   c.gridx=0;
                   c.gridy=4;
                  // c.gridwidth=1;
                  // c.gridheight=1;
                   // c.weightx=1;
                   // c.weighty=0;
                   //c.fill=GridBagConstraint;
                   c.insets=boundaries;
                   c.anchor=GridBagConstraints.FIRST_LINE_START;
                   gl.setConstraints(PanelSignatories,c);
                   menu.getContentPane().add(PanelSignatories);

                    //boundaries.left=60;
                   // boundaries.right=1;
                  //  boundaries.top=1;
                  //  boundaries.bottom=1;
                    c.gridx=2;
                    c.gridy=5;
                    c.gridwidth=1;
                    c.gridheight=2;
                    c.anchor=GridBagConstraints.CENTER;
                    gl.setConstraints(SignaturePanel,c);
                   menu.getContentPane().add(SignaturePanel);


                   JPanel PanelSignatoryCombination = new JPanel();
                      JLabel lblSignatoryCombination=new JLabel("Signature Combination");
                      PanelSignatoryCombination.add(lblSignatoryCombination);
                    //lblPanel.setBorder(new LineBorder(Color.gray));

                     c.gridx=1;
                    c.gridy=4;
                    c.gridwidth=1;
                    c.gridheight=1;
                    // c.weightx=1;
                    // c.weighty=0;
                    //c.fill=GridBagConstraint;
                    c.anchor=GridBagConstraints.FIRST_LINE_START;
                    gl.setConstraints(PanelSignatoryCombination,c);
                    menu.getContentPane().add(PanelSignatoryCombination);



      c.gridx=0;
      c.gridy=6;
      c.gridwidth=1;
      c.gridheight=1;
     // c.weightx=1;
      c.anchor=GridBagConstraints.FIRST_LINE_START;
     c.weighty=2;
      c.fill=GridBagConstraints.BOTH;
      gl.setConstraints(SignatoriesPanel,c);
       menu.getContentPane().add(SignatoriesPanel);


      c.gridx=1;
      c.gridy=6;
      c.gridwidth=1;
      c.gridheight=1;
      //c.weightx=1;
      //c.weighty=0;
      //c.fill=GridBagConstraints.BOTH;
      gl.setConstraints(SignatureCombinationPanel,c);
       menu.getContentPane().add(SignatureCombinationPanel);

      c.gridx=0;
      c.gridy=7;
      c.gridwidth=3;
      c.gridheight=1;
      //c.weightx=1;
      //c.weighty=5;
      c.fill=GridBagConstraints.BOTH;
      c.anchor=GridBagConstraints.LAST_LINE_END;
      gl.setConstraints(bottomImagePanel,c);
      menu.getContentPane().add(bottomImagePanel);


       menu.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
       menu.setBounds(0, 0, 1024, 740);
       menu.setVisible(true);



        }

  }

