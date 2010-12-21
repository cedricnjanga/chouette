/*
 * This class was automatically generated with 
 * <a href="http://www.castor.org">Castor 1.3.0.1</a>, using an XML
 * Schema.
 * $Id$
 */

package amivif.schema.types;

/**
 * Enumeration containing all the ways to board or alight a bus
 *  
 * 
 * @version $Revision$ $Date$
 */
@SuppressWarnings("serial")
public enum BoardingAlightingPossibilityType implements java.io.Serializable {


      //------------------/
     //- Enum Constants -/
    //------------------/

    /**
     * Constant BOARDANDALIGHT
     */
    BOARDANDALIGHT("BoardAndAlight"),
    /**
     * Constant ALIGHTONLY
     */
    ALIGHTONLY("AlightOnly"),
    /**
     * Constant BOARDONLY
     */
    BOARDONLY("BoardOnly"),
    /**
     * Constant NEITHERBOARDORALIGHT
     */
    NEITHERBOARDORALIGHT("NeitherBoardOrAlight"),
    /**
     * Constant BOARDANDALIGHTONREQUEST
     */
    BOARDANDALIGHTONREQUEST("BoardAndAlightOnRequest"),
    /**
     * Constant ALIGHTONREQUEST
     */
    ALIGHTONREQUEST("AlightOnRequest"),
    /**
     * Constant BOARDONREQUEST
     */
    BOARDONREQUEST("BoardOnRequest");

      //--------------------------/
     //- Class/Member Variables -/
    //--------------------------/

    /**
     * Field value.
     */
    private final java.lang.String value;


      //----------------/
     //- Constructors -/
    //----------------/

    private BoardingAlightingPossibilityType(final java.lang.String value) {
        this.value = value;
    }


      //-----------/
     //- Methods -/
    //-----------/

    /**
     * Method fromValue.
     * 
     * @param value
     * @return the constant for this value
     */
    public static amivif.schema.types.BoardingAlightingPossibilityType fromValue(
            final java.lang.String value) {
        for (BoardingAlightingPossibilityType c: BoardingAlightingPossibilityType.values()) {
            if (c.value.equals(value)) {
                return c;
            }
        }
        throw new IllegalArgumentException(value);
    }

    /**
     * 
     * 
     * @param value
     */
    public void setValue(
            final java.lang.String value) {
    }

    /**
     * Method toString.
     * 
     * @return the value of this constant
     */
    public java.lang.String toString(
    ) {
        return this.value;
    }

    /**
     * Method value.
     * 
     * @return the value of this constant
     */
    public java.lang.String value(
    ) {
        return this.value;
    }

}