package examples;

import java.util.Collection;

/**
 * ∗ A <tt>Map</tt>−like interface for an object that maps keys to a collection
 * ∗ of values. ∗ ∗ @param <K> the type of keys maintained by this map ∗ @param
 * <V> the type of mapped values
 */
public interface MultiMap<K, V> {

	/**
	 * ∗ Checks whether the map contains the value specified. ∗ ∗ @param value the
	 * value to search for ∗ @return true if the map contains the value
	 */
	boolean containsValue(Object value);

	/**
	 * ∗ Gets the collection of values associated with the specified key. ∗ ∗ @param
	 * key ∗ the key to retrieve ∗ @return the Collection of values, implementations
	 * should return null for ∗ no mapping, but may return an empty collection
	 */
	Collection<V> get(K key);

	/**
	 * ∗ Adds the value to the collection associated with the specified key. ∗ ∗
	 * Unlike a normal Map the previous value is not replaced. Instead the new ∗
	 * value is added to the collection stored against the key. ∗ ∗ @param key ∗ the
	 * key to store against ∗ @param value ∗ the value to add to the collection at
	 * the key ∗ @return typically the value added if the map changed and null if
	 * the map ∗ did not change
	 */
	Collection<V> put(K key, V value);

	/**
	 * ∗ Removes all values associated with the specified key. ∗ ∗ @param key ∗ the
	 * key to remove values from ∗ @return the Collection of values removed,
	 * implementations should return ∗ null for no mapping found, but may return an
	 * empty collection50
	 */
	V remove(Object key);

	/**
	 * ∗ Removes a specific value from map. ∗ ∗ The item is removed from the
	 * collection mapped to the specified key. ∗ Other values attached to that key
	 * are unaffected. ∗ ∗ @param key ∗ the key to remove from ∗ @param item ∗ the
	 * item to remove ∗ @return the value removed (which was passed in), null if
	 * nothing removed
	 */
	V remove(java.lang.Object key, java.lang.Object item);

	/**
	 * ∗ Gets the number of keys in this map. ∗ ∗ @return the number of
	 * key−collection mappings in this map
	 */
	int size();

	/**
	 * ∗ Gets a collection containing all the values in the map. ∗ ∗ @return a
	 * collection view of the values contained in this map
	 */
	Collection<V> values();
}