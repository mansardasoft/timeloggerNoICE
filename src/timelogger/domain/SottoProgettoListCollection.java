/**
 * "Visual Paradigm: DO NOT MODIFY THIS FILE!"
 * 
 * This is an automatic generated file. It will be regenerated every time 
 * you generate persistence class.
 * 
 * Modifying its content may cause the program not work, or your work may lost.
 */

/**
 * Licensee: DuKe TeAm
 * License Type: Purchased
 */
package timelogger.domain;

import org.orm.*;

public class SottoProgettoListCollection extends org.orm.util.ORMList {
	public SottoProgettoListCollection(Object owner, org.orm.util.ORMAdapter adapter, int ownerKey, int targetKey, int collType) {
		super(owner, adapter, ownerKey, targetKey, true, collType);
	}
	
	public SottoProgettoListCollection(Object owner, org.orm.util.ORMAdapter adapter, int ownerKey, int collType) {
		super(owner, adapter, ownerKey, -1, false, collType);
	}
	
	/**
	* Return an iterator over the persistent objects
	* @return The persisten objects iterator
	*/
	public java.util.Iterator getIterator() {
		return super.getIterator(_ownerAdapter);
	}
	
	/**
	 * Add the specified persistent object to ORMList
	 * @param value the persistent object
	 */
	public void add(SottoProgetto value) {
		if (value != null) {
			super.add(value, value._ormAdapter);
		}
	}
	
	/**
	 * Remove the specified persistent object from ORMList
	 * @param value the persistent object
	 */
	public void remove(SottoProgetto value) {
		super.remove(value, value._ormAdapter);
	}
	
	/**
	 * Return true if ORMList contains the specified persistent object
	 * @param value the persistent object
	 * @return True if this contains the specified persistent object
	 */
	public boolean contains(SottoProgetto value) {
		return super.contains(value);
	}
	
	/**
	 * Return an array containing all of the persistent objects in ORMList
	 * @return The persistent objects array
	 */
	public SottoProgetto[] toArray() {
		return (SottoProgetto[]) super.toArray(new SottoProgetto[size()]);
	}
	
	/**
	 * Return an sorted array containing all of the persistent objects in ORMList
	 * @param propertyName Name of the property for sorting:<ul>
	 * <li>ID</li>
	 * <li>titolo</li>
	 * <li>durataStimata</li>
	 * <li>totaleOre</li>
	 * <li>budgetStimato</li>
	 * <li>pagaOraria</li>
	 * </ul>
	 * @return The persistent objects sorted array
	 */
	public SottoProgetto[] toArray(String propertyName) {
		return toArray(propertyName, true);
	}
	
	/**
	 * Return an sorted array containing all of the persistent objects in ORMList
	 * @param propertyName Name of the property for sorting:<ul>
	 * <li>ID</li>
	 * <li>titolo</li>
	 * <li>durataStimata</li>
	 * <li>totaleOre</li>
	 * <li>budgetStimato</li>
	 * <li>pagaOraria</li>
	 * </ul>
	 * @param ascending true for ascending, false for descending
	 * @return The persistent objects sorted array
	 */
	public SottoProgetto[] toArray(String propertyName, boolean ascending) {
		return (SottoProgetto[]) super.toArray(new SottoProgetto[size()], propertyName, ascending);
	}
	
	/**
	 * Return the persistent object at the specified position in ORMList.
	 * @param index - The specified position
	 * @return - The persistent object
	 */
	public SottoProgetto get(int index) {
		return (SottoProgetto) super.getImpl(index);
	}
	
	/**
	 * Remove the persistent object at the specified position in ORMList.
	 * @param index The specified position
	 * @return Removed persistent object
	 */
	public SottoProgetto remove(int index) {
		SottoProgetto value = get(index);
		if (value != null) {
			return (SottoProgetto) super.removeImpl(index, value._ormAdapter);
		}
		return null;
	}
	
	/**
	 * Insert the specified persistent object at the specified position in ORMList.
	 * @param index The specified position
	 * @param value The specified persistent object
	 */
	public void add(int index, SottoProgetto value) {
		if (value != null) {
			super.add(index, value, value._ormAdapter);
		}
	}
	
	/**
	 * Find the specified position of specified persistent object ORMList.
	 * @param value The persistent object
	 */
	public int indexOf(SottoProgetto value) {
		return super.indexOf(value);
	}
	
	/**
	 * Replace the persistent object at the specified position in ORMList with the specified persistent object.
	 * @param index The specified position
	 * @param value The persistent object
	 * @return Return replaced object
	 */
	public SottoProgetto set(int index, SottoProgetto value) {
		return (SottoProgetto) super.set(index, value);
	}
	
	protected PersistentManager getPersistentManager() throws PersistentException {
		return timelogger.domain.TimeloggerPersistentManager.instance();
	}
	
}

