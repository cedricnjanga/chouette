/*
 * This class was automatically generated with 
 * <a href="http://www.castor.org">Castor 1.3.0.1</a>, using an XML
 * Schema.
 * $Id$
 */

package amivif.schema;

/**
 * Message type pour les horaires
 * 
 * @version $Revision$ $Date$
 */
@SuppressWarnings("serial")
public abstract class RespPTTimetableTypeType extends chouette.schema.castor.SchemaObject 
implements java.io.Serializable
{


      //--------------------------/
     //- Class/Member Variables -/
    //--------------------------/

    /**
     * Field _transportNetwork.
     */
    private amivif.schema.TransportNetwork _transportNetwork;

    /**
     * Field _companyList.
     */
    private java.util.List<amivif.schema.Company> _companyList;

    /**
     * Field _line.
     */
    private amivif.schema.Line _line;

    /**
     * Field _subLineList.
     */
    private java.util.List<amivif.schema.SubLine> _subLineList;

    /**
     * Field _timetableList.
     */
    private java.util.List<amivif.schema.Timetable> _timetableList;

    /**
     * Field _journeyPatternList.
     */
    private java.util.List<amivif.schema.JourneyPattern> _journeyPatternList;

    /**
     * Field _vehicleJourneyList.
     */
    private java.util.List<amivif.schema.VehicleJourney> _vehicleJourneyList;


      //----------------/
     //- Constructors -/
    //----------------/

    public RespPTTimetableTypeType() {
        super();
        this._companyList = new java.util.ArrayList<amivif.schema.Company>();
        this._subLineList = new java.util.ArrayList<amivif.schema.SubLine>();
        this._timetableList = new java.util.ArrayList<amivif.schema.Timetable>();
        this._journeyPatternList = new java.util.ArrayList<amivif.schema.JourneyPattern>();
        this._vehicleJourneyList = new java.util.ArrayList<amivif.schema.VehicleJourney>();
    }


      //-----------/
     //- Methods -/
    //-----------/

    /**
     * 
     * 
     * @param vCompany
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     */
    public void addCompany(
            final amivif.schema.Company vCompany)
    throws java.lang.IndexOutOfBoundsException {
        this._companyList.add(vCompany);
    }

    /**
     * 
     * 
     * @param index
     * @param vCompany
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     */
    public void addCompany(
            final int index,
            final amivif.schema.Company vCompany)
    throws java.lang.IndexOutOfBoundsException {
        this._companyList.add(index, vCompany);
    }

    /**
     * 
     * 
     * @param vJourneyPattern
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     */
    public void addJourneyPattern(
            final amivif.schema.JourneyPattern vJourneyPattern)
    throws java.lang.IndexOutOfBoundsException {
        this._journeyPatternList.add(vJourneyPattern);
    }

    /**
     * 
     * 
     * @param index
     * @param vJourneyPattern
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     */
    public void addJourneyPattern(
            final int index,
            final amivif.schema.JourneyPattern vJourneyPattern)
    throws java.lang.IndexOutOfBoundsException {
        this._journeyPatternList.add(index, vJourneyPattern);
    }

    /**
     * 
     * 
     * @param vSubLine
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     */
    public void addSubLine(
            final amivif.schema.SubLine vSubLine)
    throws java.lang.IndexOutOfBoundsException {
        this._subLineList.add(vSubLine);
    }

    /**
     * 
     * 
     * @param index
     * @param vSubLine
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     */
    public void addSubLine(
            final int index,
            final amivif.schema.SubLine vSubLine)
    throws java.lang.IndexOutOfBoundsException {
        this._subLineList.add(index, vSubLine);
    }

    /**
     * 
     * 
     * @param vTimetable
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     */
    public void addTimetable(
            final amivif.schema.Timetable vTimetable)
    throws java.lang.IndexOutOfBoundsException {
        this._timetableList.add(vTimetable);
    }

    /**
     * 
     * 
     * @param index
     * @param vTimetable
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     */
    public void addTimetable(
            final int index,
            final amivif.schema.Timetable vTimetable)
    throws java.lang.IndexOutOfBoundsException {
        this._timetableList.add(index, vTimetable);
    }

    /**
     * 
     * 
     * @param vVehicleJourney
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     */
    public void addVehicleJourney(
            final amivif.schema.VehicleJourney vVehicleJourney)
    throws java.lang.IndexOutOfBoundsException {
        this._vehicleJourneyList.add(vVehicleJourney);
    }

    /**
     * 
     * 
     * @param index
     * @param vVehicleJourney
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     */
    public void addVehicleJourney(
            final int index,
            final amivif.schema.VehicleJourney vVehicleJourney)
    throws java.lang.IndexOutOfBoundsException {
        this._vehicleJourneyList.add(index, vVehicleJourney);
    }

    /**
     * Method enumerateCompany.
     * 
     * @return an Enumeration over all possible elements of this
     * collection
     */
    public java.util.Enumeration<? extends amivif.schema.Company> enumerateCompany(
    ) {
        return java.util.Collections.enumeration(this._companyList);
    }

    /**
     * Method enumerateJourneyPattern.
     * 
     * @return an Enumeration over all possible elements of this
     * collection
     */
    public java.util.Enumeration<? extends amivif.schema.JourneyPattern> enumerateJourneyPattern(
    ) {
        return java.util.Collections.enumeration(this._journeyPatternList);
    }

    /**
     * Method enumerateSubLine.
     * 
     * @return an Enumeration over all possible elements of this
     * collection
     */
    public java.util.Enumeration<? extends amivif.schema.SubLine> enumerateSubLine(
    ) {
        return java.util.Collections.enumeration(this._subLineList);
    }

    /**
     * Method enumerateTimetable.
     * 
     * @return an Enumeration over all possible elements of this
     * collection
     */
    public java.util.Enumeration<? extends amivif.schema.Timetable> enumerateTimetable(
    ) {
        return java.util.Collections.enumeration(this._timetableList);
    }

    /**
     * Method enumerateVehicleJourney.
     * 
     * @return an Enumeration over all possible elements of this
     * collection
     */
    public java.util.Enumeration<? extends amivif.schema.VehicleJourney> enumerateVehicleJourney(
    ) {
        return java.util.Collections.enumeration(this._vehicleJourneyList);
    }

    /**
     * Method getCompany.
     * 
     * @param index
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     * @return the value of the amivif.schema.Company at the given
     * index
     */
    public amivif.schema.Company getCompany(
            final int index)
    throws java.lang.IndexOutOfBoundsException {
        // check bounds for index
        if (index < 0 || index >= this._companyList.size()) {
            throw new IndexOutOfBoundsException("getCompany: Index value '" + index + "' not in range [0.." + (this._companyList.size() - 1) + "]");
        }

        return (amivif.schema.Company) _companyList.get(index);
    }

    /**
     * Method getCompany.Returns the contents of the collection in
     * an Array.  <p>Note:  Just in case the collection contents
     * are changing in another thread, we pass a 0-length Array of
     * the correct type into the API call.  This way we <i>know</i>
     * that the Array returned is of exactly the correct length.
     * 
     * @return this collection as an Array
     */
    public amivif.schema.Company[] getCompany(
    ) {
        amivif.schema.Company[] array = new amivif.schema.Company[0];
        return (amivif.schema.Company[]) this._companyList.toArray(array);
    }

    /**
     * Method getCompanyAsReference.Returns a reference to
     * '_companyList'. No type checking is performed on any
     * modifications to the Vector.
     * 
     * @return a reference to the Vector backing this class
     */
    public java.util.List<amivif.schema.Company> getCompanyAsReference(
    ) {
        return this._companyList;
    }

    /**
     * Method getCompanyCount.
     * 
     * @return the size of this collection
     */
    public int getCompanyCount(
    ) {
        return this._companyList.size();
    }

    /**
     * Method getJourneyPattern.
     * 
     * @param index
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     * @return the value of the amivif.schema.JourneyPattern at the
     * given index
     */
    public amivif.schema.JourneyPattern getJourneyPattern(
            final int index)
    throws java.lang.IndexOutOfBoundsException {
        // check bounds for index
        if (index < 0 || index >= this._journeyPatternList.size()) {
            throw new IndexOutOfBoundsException("getJourneyPattern: Index value '" + index + "' not in range [0.." + (this._journeyPatternList.size() - 1) + "]");
        }

        return (amivif.schema.JourneyPattern) _journeyPatternList.get(index);
    }

    /**
     * Method getJourneyPattern.Returns the contents of the
     * collection in an Array.  <p>Note:  Just in case the
     * collection contents are changing in another thread, we pass
     * a 0-length Array of the correct type into the API call. 
     * This way we <i>know</i> that the Array returned is of
     * exactly the correct length.
     * 
     * @return this collection as an Array
     */
    public amivif.schema.JourneyPattern[] getJourneyPattern(
    ) {
        amivif.schema.JourneyPattern[] array = new amivif.schema.JourneyPattern[0];
        return (amivif.schema.JourneyPattern[]) this._journeyPatternList.toArray(array);
    }

    /**
     * Method getJourneyPatternAsReference.Returns a reference to
     * '_journeyPatternList'. No type checking is performed on any
     * modifications to the Vector.
     * 
     * @return a reference to the Vector backing this class
     */
    public java.util.List<amivif.schema.JourneyPattern> getJourneyPatternAsReference(
    ) {
        return this._journeyPatternList;
    }

    /**
     * Method getJourneyPatternCount.
     * 
     * @return the size of this collection
     */
    public int getJourneyPatternCount(
    ) {
        return this._journeyPatternList.size();
    }

    /**
     * Returns the value of field 'line'.
     * 
     * @return the value of field 'Line'.
     */
    public amivif.schema.Line getLine(
    ) {
        return this._line;
    }

    /**
     * Method getSubLine.
     * 
     * @param index
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     * @return the value of the amivif.schema.SubLine at the given
     * index
     */
    public amivif.schema.SubLine getSubLine(
            final int index)
    throws java.lang.IndexOutOfBoundsException {
        // check bounds for index
        if (index < 0 || index >= this._subLineList.size()) {
            throw new IndexOutOfBoundsException("getSubLine: Index value '" + index + "' not in range [0.." + (this._subLineList.size() - 1) + "]");
        }

        return (amivif.schema.SubLine) _subLineList.get(index);
    }

    /**
     * Method getSubLine.Returns the contents of the collection in
     * an Array.  <p>Note:  Just in case the collection contents
     * are changing in another thread, we pass a 0-length Array of
     * the correct type into the API call.  This way we <i>know</i>
     * that the Array returned is of exactly the correct length.
     * 
     * @return this collection as an Array
     */
    public amivif.schema.SubLine[] getSubLine(
    ) {
        amivif.schema.SubLine[] array = new amivif.schema.SubLine[0];
        return (amivif.schema.SubLine[]) this._subLineList.toArray(array);
    }

    /**
     * Method getSubLineAsReference.Returns a reference to
     * '_subLineList'. No type checking is performed on any
     * modifications to the Vector.
     * 
     * @return a reference to the Vector backing this class
     */
    public java.util.List<amivif.schema.SubLine> getSubLineAsReference(
    ) {
        return this._subLineList;
    }

    /**
     * Method getSubLineCount.
     * 
     * @return the size of this collection
     */
    public int getSubLineCount(
    ) {
        return this._subLineList.size();
    }

    /**
     * Method getTimetable.
     * 
     * @param index
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     * @return the value of the amivif.schema.Timetable at the
     * given index
     */
    public amivif.schema.Timetable getTimetable(
            final int index)
    throws java.lang.IndexOutOfBoundsException {
        // check bounds for index
        if (index < 0 || index >= this._timetableList.size()) {
            throw new IndexOutOfBoundsException("getTimetable: Index value '" + index + "' not in range [0.." + (this._timetableList.size() - 1) + "]");
        }

        return (amivif.schema.Timetable) _timetableList.get(index);
    }

    /**
     * Method getTimetable.Returns the contents of the collection
     * in an Array.  <p>Note:  Just in case the collection contents
     * are changing in another thread, we pass a 0-length Array of
     * the correct type into the API call.  This way we <i>know</i>
     * that the Array returned is of exactly the correct length.
     * 
     * @return this collection as an Array
     */
    public amivif.schema.Timetable[] getTimetable(
    ) {
        amivif.schema.Timetable[] array = new amivif.schema.Timetable[0];
        return (amivif.schema.Timetable[]) this._timetableList.toArray(array);
    }

    /**
     * Method getTimetableAsReference.Returns a reference to
     * '_timetableList'. No type checking is performed on any
     * modifications to the Vector.
     * 
     * @return a reference to the Vector backing this class
     */
    public java.util.List<amivif.schema.Timetable> getTimetableAsReference(
    ) {
        return this._timetableList;
    }

    /**
     * Method getTimetableCount.
     * 
     * @return the size of this collection
     */
    public int getTimetableCount(
    ) {
        return this._timetableList.size();
    }

    /**
     * Returns the value of field 'transportNetwork'.
     * 
     * @return the value of field 'TransportNetwork'.
     */
    public amivif.schema.TransportNetwork getTransportNetwork(
    ) {
        return this._transportNetwork;
    }

    /**
     * Method getVehicleJourney.
     * 
     * @param index
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     * @return the value of the amivif.schema.VehicleJourney at the
     * given index
     */
    public amivif.schema.VehicleJourney getVehicleJourney(
            final int index)
    throws java.lang.IndexOutOfBoundsException {
        // check bounds for index
        if (index < 0 || index >= this._vehicleJourneyList.size()) {
            throw new IndexOutOfBoundsException("getVehicleJourney: Index value '" + index + "' not in range [0.." + (this._vehicleJourneyList.size() - 1) + "]");
        }

        return (amivif.schema.VehicleJourney) _vehicleJourneyList.get(index);
    }

    /**
     * Method getVehicleJourney.Returns the contents of the
     * collection in an Array.  <p>Note:  Just in case the
     * collection contents are changing in another thread, we pass
     * a 0-length Array of the correct type into the API call. 
     * This way we <i>know</i> that the Array returned is of
     * exactly the correct length.
     * 
     * @return this collection as an Array
     */
    public amivif.schema.VehicleJourney[] getVehicleJourney(
    ) {
        amivif.schema.VehicleJourney[] array = new amivif.schema.VehicleJourney[0];
        return (amivif.schema.VehicleJourney[]) this._vehicleJourneyList.toArray(array);
    }

    /**
     * Method getVehicleJourneyAsReference.Returns a reference to
     * '_vehicleJourneyList'. No type checking is performed on any
     * modifications to the Vector.
     * 
     * @return a reference to the Vector backing this class
     */
    public java.util.List<amivif.schema.VehicleJourney> getVehicleJourneyAsReference(
    ) {
        return this._vehicleJourneyList;
    }

    /**
     * Method getVehicleJourneyCount.
     * 
     * @return the size of this collection
     */
    public int getVehicleJourneyCount(
    ) {
        return this._vehicleJourneyList.size();
    }

    /**
     * Method isValid.
     * 
     * @return true if this object is valid according to the schema
     */
    public boolean isValid(
    ) {
        try {
            validate();
        } catch (org.exolab.castor.xml.ValidationException vex) {
            return false;
        }
        return true;
    }

    /**
     * Method iterateCompany.
     * 
     * @return an Iterator over all possible elements in this
     * collection
     */
    public java.util.Iterator<? extends amivif.schema.Company> iterateCompany(
    ) {
        return this._companyList.iterator();
    }

    /**
     * Method iterateJourneyPattern.
     * 
     * @return an Iterator over all possible elements in this
     * collection
     */
    public java.util.Iterator<? extends amivif.schema.JourneyPattern> iterateJourneyPattern(
    ) {
        return this._journeyPatternList.iterator();
    }

    /**
     * Method iterateSubLine.
     * 
     * @return an Iterator over all possible elements in this
     * collection
     */
    public java.util.Iterator<? extends amivif.schema.SubLine> iterateSubLine(
    ) {
        return this._subLineList.iterator();
    }

    /**
     * Method iterateTimetable.
     * 
     * @return an Iterator over all possible elements in this
     * collection
     */
    public java.util.Iterator<? extends amivif.schema.Timetable> iterateTimetable(
    ) {
        return this._timetableList.iterator();
    }

    /**
     * Method iterateVehicleJourney.
     * 
     * @return an Iterator over all possible elements in this
     * collection
     */
    public java.util.Iterator<? extends amivif.schema.VehicleJourney> iterateVehicleJourney(
    ) {
        return this._vehicleJourneyList.iterator();
    }

    /**
     */
    public void removeAllCompany(
    ) {
        this._companyList.clear();
    }

    /**
     */
    public void removeAllJourneyPattern(
    ) {
        this._journeyPatternList.clear();
    }

    /**
     */
    public void removeAllSubLine(
    ) {
        this._subLineList.clear();
    }

    /**
     */
    public void removeAllTimetable(
    ) {
        this._timetableList.clear();
    }

    /**
     */
    public void removeAllVehicleJourney(
    ) {
        this._vehicleJourneyList.clear();
    }

    /**
     * Method removeCompany.
     * 
     * @param vCompany
     * @return true if the object was removed from the collection.
     */
    public boolean removeCompany(
            final amivif.schema.Company vCompany) {
        boolean removed = _companyList.remove(vCompany);
        return removed;
    }

    /**
     * Method removeCompanyAt.
     * 
     * @param index
     * @return the element removed from the collection
     */
    public amivif.schema.Company removeCompanyAt(
            final int index) {
        java.lang.Object obj = this._companyList.remove(index);
        return (amivif.schema.Company) obj;
    }

    /**
     * Method removeJourneyPattern.
     * 
     * @param vJourneyPattern
     * @return true if the object was removed from the collection.
     */
    public boolean removeJourneyPattern(
            final amivif.schema.JourneyPattern vJourneyPattern) {
        boolean removed = _journeyPatternList.remove(vJourneyPattern);
        return removed;
    }

    /**
     * Method removeJourneyPatternAt.
     * 
     * @param index
     * @return the element removed from the collection
     */
    public amivif.schema.JourneyPattern removeJourneyPatternAt(
            final int index) {
        java.lang.Object obj = this._journeyPatternList.remove(index);
        return (amivif.schema.JourneyPattern) obj;
    }

    /**
     * Method removeSubLine.
     * 
     * @param vSubLine
     * @return true if the object was removed from the collection.
     */
    public boolean removeSubLine(
            final amivif.schema.SubLine vSubLine) {
        boolean removed = _subLineList.remove(vSubLine);
        return removed;
    }

    /**
     * Method removeSubLineAt.
     * 
     * @param index
     * @return the element removed from the collection
     */
    public amivif.schema.SubLine removeSubLineAt(
            final int index) {
        java.lang.Object obj = this._subLineList.remove(index);
        return (amivif.schema.SubLine) obj;
    }

    /**
     * Method removeTimetable.
     * 
     * @param vTimetable
     * @return true if the object was removed from the collection.
     */
    public boolean removeTimetable(
            final amivif.schema.Timetable vTimetable) {
        boolean removed = _timetableList.remove(vTimetable);
        return removed;
    }

    /**
     * Method removeTimetableAt.
     * 
     * @param index
     * @return the element removed from the collection
     */
    public amivif.schema.Timetable removeTimetableAt(
            final int index) {
        java.lang.Object obj = this._timetableList.remove(index);
        return (amivif.schema.Timetable) obj;
    }

    /**
     * Method removeVehicleJourney.
     * 
     * @param vVehicleJourney
     * @return true if the object was removed from the collection.
     */
    public boolean removeVehicleJourney(
            final amivif.schema.VehicleJourney vVehicleJourney) {
        boolean removed = _vehicleJourneyList.remove(vVehicleJourney);
        return removed;
    }

    /**
     * Method removeVehicleJourneyAt.
     * 
     * @param index
     * @return the element removed from the collection
     */
    public amivif.schema.VehicleJourney removeVehicleJourneyAt(
            final int index) {
        java.lang.Object obj = this._vehicleJourneyList.remove(index);
        return (amivif.schema.VehicleJourney) obj;
    }

    /**
     * 
     * 
     * @param index
     * @param vCompany
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     */
    public void setCompany(
            final int index,
            final amivif.schema.Company vCompany)
    throws java.lang.IndexOutOfBoundsException {
        // check bounds for index
        if (index < 0 || index >= this._companyList.size()) {
            throw new IndexOutOfBoundsException("setCompany: Index value '" + index + "' not in range [0.." + (this._companyList.size() - 1) + "]");
        }

        this._companyList.set(index, vCompany);
    }

    /**
     * 
     * 
     * @param vCompanyArray
     */
    public void setCompany(
            final amivif.schema.Company[] vCompanyArray) {
        //-- copy array
        _companyList.clear();

        for (int i = 0; i < vCompanyArray.length; i++) {
                this._companyList.add(vCompanyArray[i]);
        }
    }

    /**
     * Sets the value of '_companyList' by copying the given
     * Vector. All elements will be checked for type safety.
     * 
     * @param vCompanyList the Vector to copy.
     */
    public void setCompany(
            final java.util.List<amivif.schema.Company> vCompanyList) {
        // copy vector
        this._companyList.clear();

        this._companyList.addAll(vCompanyList);
    }

    /**
     * Sets the value of '_companyList' by setting it to the given
     * Vector. No type checking is performed.
     * @deprecated
     * 
     * @param companyList the Vector to set.
     */
    public void setCompanyAsReference(
            final java.util.List<amivif.schema.Company> companyList) {
        this._companyList = companyList;
    }

    /**
     * 
     * 
     * @param index
     * @param vJourneyPattern
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     */
    public void setJourneyPattern(
            final int index,
            final amivif.schema.JourneyPattern vJourneyPattern)
    throws java.lang.IndexOutOfBoundsException {
        // check bounds for index
        if (index < 0 || index >= this._journeyPatternList.size()) {
            throw new IndexOutOfBoundsException("setJourneyPattern: Index value '" + index + "' not in range [0.." + (this._journeyPatternList.size() - 1) + "]");
        }

        this._journeyPatternList.set(index, vJourneyPattern);
    }

    /**
     * 
     * 
     * @param vJourneyPatternArray
     */
    public void setJourneyPattern(
            final amivif.schema.JourneyPattern[] vJourneyPatternArray) {
        //-- copy array
        _journeyPatternList.clear();

        for (int i = 0; i < vJourneyPatternArray.length; i++) {
                this._journeyPatternList.add(vJourneyPatternArray[i]);
        }
    }

    /**
     * Sets the value of '_journeyPatternList' by copying the given
     * Vector. All elements will be checked for type safety.
     * 
     * @param vJourneyPatternList the Vector to copy.
     */
    public void setJourneyPattern(
            final java.util.List<amivif.schema.JourneyPattern> vJourneyPatternList) {
        // copy vector
        this._journeyPatternList.clear();

        this._journeyPatternList.addAll(vJourneyPatternList);
    }

    /**
     * Sets the value of '_journeyPatternList' by setting it to the
     * given Vector. No type checking is performed.
     * @deprecated
     * 
     * @param journeyPatternList the Vector to set.
     */
    public void setJourneyPatternAsReference(
            final java.util.List<amivif.schema.JourneyPattern> journeyPatternList) {
        this._journeyPatternList = journeyPatternList;
    }

    /**
     * Sets the value of field 'line'.
     * 
     * @param line the value of field 'line'.
     */
    public void setLine(
            final amivif.schema.Line line) {
        this._line = line;
    }

    /**
     * 
     * 
     * @param index
     * @param vSubLine
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     */
    public void setSubLine(
            final int index,
            final amivif.schema.SubLine vSubLine)
    throws java.lang.IndexOutOfBoundsException {
        // check bounds for index
        if (index < 0 || index >= this._subLineList.size()) {
            throw new IndexOutOfBoundsException("setSubLine: Index value '" + index + "' not in range [0.." + (this._subLineList.size() - 1) + "]");
        }

        this._subLineList.set(index, vSubLine);
    }

    /**
     * 
     * 
     * @param vSubLineArray
     */
    public void setSubLine(
            final amivif.schema.SubLine[] vSubLineArray) {
        //-- copy array
        _subLineList.clear();

        for (int i = 0; i < vSubLineArray.length; i++) {
                this._subLineList.add(vSubLineArray[i]);
        }
    }

    /**
     * Sets the value of '_subLineList' by copying the given
     * Vector. All elements will be checked for type safety.
     * 
     * @param vSubLineList the Vector to copy.
     */
    public void setSubLine(
            final java.util.List<amivif.schema.SubLine> vSubLineList) {
        // copy vector
        this._subLineList.clear();

        this._subLineList.addAll(vSubLineList);
    }

    /**
     * Sets the value of '_subLineList' by setting it to the given
     * Vector. No type checking is performed.
     * @deprecated
     * 
     * @param subLineList the Vector to set.
     */
    public void setSubLineAsReference(
            final java.util.List<amivif.schema.SubLine> subLineList) {
        this._subLineList = subLineList;
    }

    /**
     * 
     * 
     * @param index
     * @param vTimetable
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     */
    public void setTimetable(
            final int index,
            final amivif.schema.Timetable vTimetable)
    throws java.lang.IndexOutOfBoundsException {
        // check bounds for index
        if (index < 0 || index >= this._timetableList.size()) {
            throw new IndexOutOfBoundsException("setTimetable: Index value '" + index + "' not in range [0.." + (this._timetableList.size() - 1) + "]");
        }

        this._timetableList.set(index, vTimetable);
    }

    /**
     * 
     * 
     * @param vTimetableArray
     */
    public void setTimetable(
            final amivif.schema.Timetable[] vTimetableArray) {
        //-- copy array
        _timetableList.clear();

        for (int i = 0; i < vTimetableArray.length; i++) {
                this._timetableList.add(vTimetableArray[i]);
        }
    }

    /**
     * Sets the value of '_timetableList' by copying the given
     * Vector. All elements will be checked for type safety.
     * 
     * @param vTimetableList the Vector to copy.
     */
    public void setTimetable(
            final java.util.List<amivif.schema.Timetable> vTimetableList) {
        // copy vector
        this._timetableList.clear();

        this._timetableList.addAll(vTimetableList);
    }

    /**
     * Sets the value of '_timetableList' by setting it to the
     * given Vector. No type checking is performed.
     * @deprecated
     * 
     * @param timetableList the Vector to set.
     */
    public void setTimetableAsReference(
            final java.util.List<amivif.schema.Timetable> timetableList) {
        this._timetableList = timetableList;
    }

    /**
     * Sets the value of field 'transportNetwork'.
     * 
     * @param transportNetwork the value of field 'transportNetwork'
     */
    public void setTransportNetwork(
            final amivif.schema.TransportNetwork transportNetwork) {
        this._transportNetwork = transportNetwork;
    }

    /**
     * 
     * 
     * @param index
     * @param vVehicleJourney
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     */
    public void setVehicleJourney(
            final int index,
            final amivif.schema.VehicleJourney vVehicleJourney)
    throws java.lang.IndexOutOfBoundsException {
        // check bounds for index
        if (index < 0 || index >= this._vehicleJourneyList.size()) {
            throw new IndexOutOfBoundsException("setVehicleJourney: Index value '" + index + "' not in range [0.." + (this._vehicleJourneyList.size() - 1) + "]");
        }

        this._vehicleJourneyList.set(index, vVehicleJourney);
    }

    /**
     * 
     * 
     * @param vVehicleJourneyArray
     */
    public void setVehicleJourney(
            final amivif.schema.VehicleJourney[] vVehicleJourneyArray) {
        //-- copy array
        _vehicleJourneyList.clear();

        for (int i = 0; i < vVehicleJourneyArray.length; i++) {
                this._vehicleJourneyList.add(vVehicleJourneyArray[i]);
        }
    }

    /**
     * Sets the value of '_vehicleJourneyList' by copying the given
     * Vector. All elements will be checked for type safety.
     * 
     * @param vVehicleJourneyList the Vector to copy.
     */
    public void setVehicleJourney(
            final java.util.List<amivif.schema.VehicleJourney> vVehicleJourneyList) {
        // copy vector
        this._vehicleJourneyList.clear();

        this._vehicleJourneyList.addAll(vVehicleJourneyList);
    }

    /**
     * Sets the value of '_vehicleJourneyList' by setting it to the
     * given Vector. No type checking is performed.
     * @deprecated
     * 
     * @param vehicleJourneyList the Vector to set.
     */
    public void setVehicleJourneyAsReference(
            final java.util.List<amivif.schema.VehicleJourney> vehicleJourneyList) {
        this._vehicleJourneyList = vehicleJourneyList;
    }

    /**
     * 
     * 
     * @throws org.exolab.castor.xml.ValidationException if this
     * object is an invalid instance according to the schema
     */
    public void validate(
    )
    throws org.exolab.castor.xml.ValidationException {
        org.exolab.castor.xml.Validator validator = new org.exolab.castor.xml.Validator();
        validator.validate(this);
    }

}