package com.datazuul.apps.countries;

// Countries.java

import java.awt.Color;
import java.awt.Component;
import java.awt.EventQueue;
import java.awt.FlowLayout;
import java.util.ArrayList;
import java.util.Arrays;

import javax.swing.BorderFactory;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JScrollPane;
import javax.swing.ListCellRenderer;
import javax.swing.border.Border;

public class Countries extends JFrame
{
   Countries (String title)
   {
      super (title);
      setDefaultCloseOperation (EXIT_ON_CLOSE);

      FlowLayout layout = new FlowLayout (FlowLayout.CENTER, 5, 5);
      layout.setAlignOnBaseline (true);
      getContentPane ().setLayout (layout);

      Country [] carray;
      JList list = new JList (carray = createCountriesArray ());
//      list.setEnabled (false);
      list.setCellRenderer (new CountryCellRenderer (null));
      list.setVisibleRowCount (8);
      list.setSelectedIndex (0);
      getContentPane ().add (new JScrollPane (list));

      JComboBox cb = new JComboBox (carray);
//      cb.setEnabled (false);
      cb.setRenderer (new CountryCellRenderer (cb));
      getContentPane ().add (cb);

      pack ();
      setVisible (true);
   }

   Country [] createCountriesArray ()
   {
      String [] citems =
      {
         "AD,Andorra",
         "AE,United Arab Emirates",
         "AF,Afghanistan",
         "AG,Antigua and Barbuda",
         "AI,Anguilla",
         "AL,Albania",
         "AM,Armenia",
         "AN,Netherlands Antilles",
         "AO,Angola",
         "AR,Argentina",
         "AS,American Samoa",
         "AT,Austria",
         "AU,Australia",
         "AW,Aruba",
         "AX,�land Islands",
         "AZ,Azerbaijan",
         "BA,Bosnia and Herzegovina",
         "BB,Barbados",
         "BD,Bangladesh",
         "BE,Belgium",
         "BF,Burkina Faso",
         "BG,Bulgaria",
         "BH,Bahrain",
         "BI,Burundi",
         "BJ,Benin",
         "BM,Bermuda",
         "BN,Brunei Darussalam",
         "BO,Bolivia",
         "BR,Brazil",
         "BS,Bahamas",
         "BT,Bhutan",
         "BV,Bouvet Island",
         "BW,Botswana",
         "BY,Belarus",
         "BZ,Belize",
         "CA,Canada",
         "CC,Cocos (Keeling) Islands",
         "CD,Congo, the Democratic Republic of the",
         "CF,Central African Republic",
         "CG,Congo",
         "CH,Switzerland",
         "CI,Cote d'Ivoire C�te d'Ivoire",
         "CK,Cook Islands",
         "CL,Chile",
         "CM,Cameroon",
         "CN,China",
         "CO,Colombia",
         "CR,Costa Rica",
         "CU,Cuba",
         "CV,Cape Verde",
         "CX,Christmas Island",
         "CY,Cyprus",
         "CZ,Czech Republic",
         "DE,Germany",
         "DJ,Djibouti",
         "DK,Denmark",
         "DM,Dominica",
         "DO,Dominican Republic",
         "DZ,Algeria",
         "EC,Ecuador",
         "EE,Estonia",
         "EG,Egypt",
         "EH,Western Sahara",
         "ER,Eritrea",
         "ES,Spain",
         "ET,Ethiopia",
         "FI,Finland",
         "FJ,Fiji",
         "FK,Falkland Islands (Malvinas)",
         "FM,Micronesia, Federated States of",
         "FO,Faroe Islands",
         "FR,France",
         "GA,Gabon",
         "GB,United Kingdom",
         "GD,Grenada",
         "GE,Georgia",
         "GF,French Guiana",
         "GH,Ghana",
         "GI,Gibraltar",
         "GL,Greenland",
         "GM,Gambia",
         "GN,Guinea",
         "GP,Guadeloupe",
         "GQ,Equatorial Guinea",
         "GR,Greece",
         "GS,South Georgia and the South Sandwich Islands",
         "GT,Guatemala",
         "GU,Guam",
         "GW,Guinea-Bissau",
         "GY,Guyana",
         "HK,Hong Kong",
         "HM,Heard Island and McDonald Islands",
         "HN,Honduras",
         "HR,Croatia",
         "HT,Haiti",
         "HU,Hungary",
         "ID,Indonesia",
         "IE,Ireland",
         "IL,Israel",
         "IN,India",
         "IO,British Indian Ocean Territory",
         "IQ,Iraq",
         "IR,Iran, Islamic Republic of",
         "IS,Iceland",
         "IT,Italy",
         "JM,Jamaica",
         "JO,Jordan",
         "JP,Japan",
         "KE,Kenya",
         "KG,Kyrgyzstan",
         "KH,Cambodia",
         "KI,Kiribati",
         "KM,Comoros",
         "KN,Saint Kitts and Nevis",
         "KP,Korea, Democratic People's Republic of",
         "KR,Korea, Republic of",
         "KW,Kuwait",
         "KY,Cayman Islands",
         "KZ,Kazakhstan",
         "LA,Lao People's Democratic Republic",
         "LB,Lebanon",
         "LC,Saint Lucia",
         "LI,Liechtenstein",
         "LK,Sri Lanka",
         "LR,Liberia",
         "LS,Lesotho",
         "LT,Lithuania",
         "LU,Luxembourg",
         "LV,Latvia",
         "LY,Libyan Arab Jamahiriya",
         "MA,Morocco",
         "MC,Monaco",
         "MD,Moldova, Republic of",
         "ME,Montenegro",
         "MG,Madagascar",
         "MH,Marshall Islands",
         "MK,Macedonia, the former Yugoslav Republic of",
         "ML,Mali",
         "MM,Myanmar",
         "MN,Mongolia",
         "MO,Macao",
         "MP,Northern Mariana Islands",
         "MQ,Martinique",
         "MR,Mauritania",
         "MS,Montserrat",
         "MT,Malta",
         "MU,Mauritius",
         "MV,Maldives",
         "MW,Malawi",
         "MX,Mexico",
         "MY,Malaysia",
         "MZ,Mozambique",
         "NA,Namibia",
         "NC,New Caledonia",
         "NE,Niger",
         "NF,Norfolk Island",
         "NG,Nigeria",
         "NI,Nicaragua",
         "NL,Netherlands",
         "NO,Norway",
         "NP,Nepal",
         "NR,Nauru",
         "NU,Niue",
         "NZ,New Zealand",
         "OM,Oman",
         "PA,Panama",
         "PE,Peru",
         "PF,French Polynesia",
         "PG,Papua New Guinea",
         "PH,Philippines",
         "PK,Pakistan",
         "PL,Poland",
         "PM,Saint Pierre and Miquelon",
         "PN,Pitcairn",
         "PR,Puerto Rico",
         "PS,Palestinian Territory, Occupied",
         "PT,Portugal",
         "PW,Palau",
         "PY,Paraguay",
         "QA,Qatar",
         "RE,Reunion R�union",
         "RO,Romania",
         "RS,Serbia",
         "RU,Russian Federation",
         "RW,Rwanda",
         "SA,Saudi Arabia",
         "SB,Solomon Islands",
         "SC,Seychelles",
         "SD,Sudan",
         "SE,Sweden",
         "SG,Singapore",
         "SH,Saint Helena",
         "SI,Slovenia",
         "SJ,Svalbard and Jan Mayen",
         "SK,Slovakia",
         "SL,Sierra Leone",
         "SM,San Marino",
         "SN,Senegal",
         "SO,Somalia",
         "SR,Suriname",
         "ST,Sao Tome and Principe",
         "SV,El Salvador",
         "SY,Syrian Arab Republic",
         "SZ,Swaziland",
         "TC,Turks and Caicos Islands",
         "TD,Chad",
         "TF,French Southern Territories",
         "TG,Togo",
         "TH,Thailand",
         "TJ,Tajikistan",
         "TK,Tokelau",
         "TL,Timor-Leste",
         "TM,Turkmenistan",
         "TN,Tunisia",
         "TO,Tonga",
         "TR,Turkey",
         "TT,Trinidad and Tobago",
         "TV,Tuvalu",
         "TW,Taiwan, Province of China",
         "TZ,Tanzania, United Republic of",
         "UA,Ukraine",
         "UG,Uganda",
         "UM,United States Minor Outlying Islands",
         "US,United States",
         "UY,Uruguay",
         "UZ,Uzbekistan",
         "VA,Holy See (Vatican City State)",
         "VC,Saint Vincent and the Grenadines",
         "VE,Venezuela",
         "VG,Virgin Islands, British",
         "VI,Virgin Islands, U.S.",
         "VN,Viet Nam",
         "VU,Vanuatu",
         "WF,Wallis and Futuna",
         "WS,Samoa",
         "YE,Yemen",
         "YT,Mayotte",
         "ZA,South Africa",
         "ZM,Zambia",
         "ZW,Zimbabwe"
      };

      ArrayList<Country> clist = new ArrayList<Country> ();
      for (String citem: citems)
      {
           String [] cdata = citem.split (",");
           clist.add (new Country (cdata [1],
                      getClass ().getResource ("icons/"+
                                               cdata [0].toLowerCase ()+
                                               ".png")));
      }

      Country [] carray = clist.toArray (new Country [0]);
      Arrays.sort (carray);
      return carray;
   }

   public static void main (String [] args)
   {
      Runnable r = new Runnable ()
                   {
                       public void run ()
                       {
                          // Always create Swing UIs on event-dispatching
                          // thread.

                          new Countries ("Countries");
                       }
                   };
      EventQueue.invokeLater (r);
   }
}

class CountryCellRenderer extends JLabel implements ListCellRenderer
{
   private Border border;

   private JComboBox cb;

   CountryCellRenderer (JComboBox cb)
   {
      this.cb = cb;

      // Leave a 10-pixel separator between the flag icon and country name.

      setIconTextGap (10);

      // Swing labels default to being transparent; the container's color
      // shows through. To change a Swing label's background color, you must
      // first make the label opaque (by passing true to setOpaque()). Later,
      // you invoke setBackground(), passing the new color as the argument.

      setOpaque (true);

      // This border is placed around a cell that is selected and has focus.

      border = BorderFactory.createLineBorder (Color.RED, 1);
   }

   public Component getListCellRendererComponent (JList list,
                                                  Object value,
                                                  int index,
                                                  boolean isSelected,
                                                  boolean cellHasFocus)
   {
      Country c = (Country) value;
      setText (c.getName ());
      setIcon (c.getFlagIcon ());

      if (isSelected)

      {
          setBackground (list.getSelectionBackground ());
          setForeground (list.getSelectionForeground ());
      }
      else
      {
          setBackground (list.getBackground ());
          setForeground (list.getForeground ());
      }

      setFont (list.getFont ());

      // list.isEnabled() always returns true for a combobox's list, even if
      // the combobox is disabled.

      setEnabled (cb != null ? cb.isEnabled () : list.isEnabled ());

      if (isSelected && cellHasFocus) // cellHasFocus ignored for JComboBox
          setBorder (border);
      else
          setBorder (null);

      return this;
   }
}
