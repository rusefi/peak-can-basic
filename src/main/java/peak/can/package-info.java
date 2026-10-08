/**
 * Mutable numeric buffers used by the PCAN-Basic JNI parameter API.
 * JNI looks up {@code peak.can.MutableInteger} and {@code peak.can.MutableLong};
 * each exposes a public {@code value} field and matching {@code getValue()}
 * and {@code setValue(...)} methods. The classes follow the PEAK PCAN-Basic
 * Java source in {@code GUI/JAVA/PCAN-Basic_java_src/peak/can}, distributed
 * in <a href="https://www.peak-system.com/fileadmin/media/files/PCAN-Basic.zip">PCAN-Basic.zip</a>.
 */
package peak.can;
