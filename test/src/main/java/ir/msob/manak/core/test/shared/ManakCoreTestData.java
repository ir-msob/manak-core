package ir.msob.manak.core.test.shared;

import com.google.common.collect.Sets;
import ir.msob.manak.core.model.jima.childdomain.characteristic.Characteristic;
import ir.msob.manak.core.model.jima.childdomain.contactmedium.ContactMedium;
import ir.msob.manak.core.model.jima.childdomain.objectvalidation.ObjectValidation;
import ir.msob.manak.core.model.jima.childdomain.relatedaction.RelatedAction;
import ir.msob.manak.core.model.jima.childdomain.relatedobject.relateddomain.RelatedDomain;
import ir.msob.manak.core.model.jima.childdomain.relatedobject.relatedparty.RelatedParty;
import org.assertj.core.api.Assertions;

import java.util.Collections;
import java.util.SortedSet;

import static ir.msob.jima.core.test.CoreTestData.*;

public class ManakCoreTestData {
    // Characteristic constants
    public static final Characteristic DEFAULT_REQUIRED_CHARACTERISTIC = initDefaultRequiredCharacteristic();
    public static final SortedSet<Characteristic> DEFAULT_REQUIRED_CHARACTERISTICS = Sets.newTreeSet(Collections.singleton(DEFAULT_REQUIRED_CHARACTERISTIC));
    public static final Characteristic DEFAULT_CHARACTERISTIC = initDefaultCharacteristic();
    public static final SortedSet<Characteristic> DEFAULT_CHARACTERISTICS = Sets.newTreeSet(Collections.singleton(DEFAULT_CHARACTERISTIC));
    public static final Characteristic UPDATED_REQUIRED_CHARACTERISTIC = initUpdatedRequiredCharacteristic();
    public static final SortedSet<Characteristic> UPDATED_REQUIRED_CHARACTERISTICS = Sets.newTreeSet(Collections.singleton(UPDATED_REQUIRED_CHARACTERISTIC));
    public static final Characteristic UPDATED_CHARACTERISTIC = initUpdatedCharacteristic();
    public static final SortedSet<Characteristic> UPDATED_CHARACTERISTICS = Sets.newTreeSet(Collections.singleton(DEFAULT_CHARACTERISTIC));
    // ContactMedium constants
    public static final ContactMedium DEFAULT_REQUIRED_CONTACT_MEDIUM = initDefaultRequiredContactMedium();
    public static final ContactMedium DEFAULT_CONTACT_MEDIUM = initDefaultContactMedium();
    public static final ContactMedium UPDATED_REQUIRED_CONTACT_MEDIUM = initUpdatedRequiredContactMedium();
    public static final ContactMedium UPDATED_CONTACT_MEDIUM = initUpdatedContactMedium();
    // ObjectValidation constants
    public static final ObjectValidation DEFAULT_REQUIRED_OBJECT_VALIDATION = initDefaultRequiredObjectValidation();
    public static final ObjectValidation DEFAULT_OBJECT_VALIDATION = initDefaultObjectValidation();
    public static final ObjectValidation UPDATED_REQUIRED_OBJECT_VALIDATION = initUpdatedRequiredObjectValidation();
    public static final ObjectValidation UPDATED_OBJECT_VALIDATION = initUpdatedObjectValidation();
    // RelatedAction constants
    public static final RelatedAction DEFAULT_REQUIRED_RELATED_ACTION = initDefaultRequiredRelatedAction();
    public static final RelatedAction DEFAULT_RELATED_ACTION = initDefaultRelatedAction();
    public static final RelatedAction UPDATED_REQUIRED_RELATED_ACTION = initUpdatedRequiredRelatedAction();
    public static final RelatedAction UPDATED_RELATED_ACTION = initUpdatedRelatedAction();

    private ManakCoreTestData() {
    }

    /**
     * Updates the provided childdomain party with updated values.
     *
     * @param relatedParty the childdomain party to update
     */
    public static void UPDATED_RELATED_PARTY(RelatedParty relatedParty) {
        relatedParty.setName(UPDATED_STRING);
        relatedParty.setRelatedId(UPDATED_PARTY_ID);
        relatedParty.setRole(UPDATED_STRING);
        relatedParty.setReferringType(UPDATED_STRING);
    }

    /**
     * Updates the provided required childdomain party with updated values.
     *
     * @param relatedParty the required childdomain party to update
     */
    public static void UPDATED_REQUIRED_RELATED_PARTY(RelatedParty relatedParty) {
        relatedParty.setName(UPDATED_STRING);
        relatedParty.setRelatedId(UPDATED_PARTY_ID);
    }

    /**
     * Updates the provided childdomain domain with updated values.
     *
     * @param relatedDomain the childdomain domain to update
     */
    @SuppressWarnings("unchecked")
    public static void UPDATED_RELATED_DOMAIN(RelatedDomain relatedDomain) {
        relatedDomain.setName(UPDATED_STRING);
        relatedDomain.setRelatedId(UPDATED_ID.toString());
        relatedDomain.setRole(UPDATED_STRING);
        relatedDomain.setReferringType(UPDATED_STRING);
    }

    /**
     * Updates the provided required childdomain domain with updated values.
     *
     * @param relatedDomain the required childdomain domain to update
     */
    @SuppressWarnings("unchecked")
    public static void UPDATED_REQUIRED_RELATED_DOMAIN(RelatedDomain relatedDomain) {
        relatedDomain.setName(UPDATED_STRING);
        relatedDomain.setRelatedId(UPDATED_ID.toString());
    }


    /**
     * Initializes the default required contact medium.
     *
     * @return the initialized default required contact medium
     */
    public static ContactMedium initDefaultRequiredContactMedium() {
        ContactMedium contactMedium = new ContactMedium();
        contactMedium.setName(DEFAULT_STRING);
        contactMedium.setType(DEFAULT_STRING);
        contactMedium.setValue(DEFAULT_STRING);
        return contactMedium;
    }

    /**
     * Initializes the default  contact medium.
     *
     * @return the initialized default  contact medium
     */
    public static ContactMedium initDefaultContactMedium() {
        ContactMedium contactMedium = new ContactMedium();
        contactMedium.setName(DEFAULT_STRING);
        contactMedium.setType(DEFAULT_STRING);
        contactMedium.setValue(DEFAULT_STRING);
        contactMedium.setOrder(DEFAULT_INTEGER);
        contactMedium.setValidFor(DEFAULT_TIME_PERIOD);
        return contactMedium;
    }

    /**
     * Initializes the updated required contact medium.
     *
     * @return the initialized updated required contact medium
     */
    public static ContactMedium initUpdatedRequiredContactMedium() {
        ContactMedium contactMedium = new ContactMedium();
        contactMedium.setName(UPDATED_STRING);
        contactMedium.setType(UPDATED_STRING);
        contactMedium.setValue(UPDATED_STRING);
        return contactMedium;
    }

    /**
     * Initializes the updated  contact medium.
     *
     * @return the initialized updated  contact medium
     */
    public static ContactMedium initUpdatedContactMedium() {
        ContactMedium contactMedium = new ContactMedium();
        contactMedium.setName(UPDATED_STRING);
        contactMedium.setType(UPDATED_STRING);
        contactMedium.setValue(UPDATED_STRING);
        contactMedium.setOrder(UPDATED_INTEGER);
        contactMedium.setValidFor(UPDATED_TIME_PERIOD);
        return contactMedium;
    }

    /**
     * Initializes the default required object validation.
     *
     * @return the initialized default required object validation
     */
    public static RelatedAction initDefaultRequiredRelatedAction() {
        RelatedAction result = new RelatedAction();
        result.setName(DEFAULT_STRING);
        result.setStatus(DEFAULT_STRING);
        return result;
    }

    /**
     * Initializes the default  object validation.
     *
     * @return the initialized default  object validation
     */
    public static RelatedAction initDefaultRelatedAction() {
        RelatedAction result = new RelatedAction();
        result.setName(DEFAULT_STRING);
        result.setStatus(DEFAULT_STRING);
        result.setMandatory(DEFAULT_BOOLEAN);
        result.setValidFor(DEFAULT_TIME_PERIOD);
        result.setAuditInfo(DEFAULT_AUDIT_INFO);
        return result;
    }

    /**
     * Initializes the updated required object validation.
     *
     * @return the initialized updated required object validation
     */
    public static RelatedAction initUpdatedRequiredRelatedAction() {
        RelatedAction result = new RelatedAction();
        result.setName(UPDATED_STRING);
        result.setStatus(UPDATED_STRING);
        return result;
    }

    /**
     * Initializes the updated  object validation.
     *
     * @return the initialized updated  object validation
     */
    public static RelatedAction initUpdatedRelatedAction() {
        RelatedAction result = new RelatedAction();
        result.setName(UPDATED_STRING);
        result.setStatus(UPDATED_STRING);
        result.setMandatory(UPDATED_BOOLEAN);
        result.setValidFor(UPDATED_TIME_PERIOD);
        result.setAuditInfo(UPDATED_AUDIT_INFO);
        return result;
    }

    /**
     * Initializes the default required object validation.
     *
     * @return the initialized default required object validation
     */
    public static ObjectValidation initDefaultRequiredObjectValidation() {
        ObjectValidation result = new ObjectValidation();
        result.setName(DEFAULT_STRING);
        result.setStatus(DEFAULT_STRING);
        return result;
    }

    /**
     * Initializes the default  object validation.
     *
     * @return the initialized default  object validation
     */
    public static ObjectValidation initDefaultObjectValidation() {
        ObjectValidation result = new ObjectValidation();
        result.setName(DEFAULT_STRING);
        result.setStatus(DEFAULT_STRING);
        result.setEnabled(DEFAULT_BOOLEAN);
        result.setValidFor(DEFAULT_TIME_PERIOD);
        return result;
    }

    /**
     * Initializes the updated required object validation.
     *
     * @return the initialized updated required object validation
     */
    public static ObjectValidation initUpdatedRequiredObjectValidation() {
        ObjectValidation result = new ObjectValidation();
        result.setName(UPDATED_STRING);
        result.setStatus(UPDATED_STRING);
        return result;
    }

    /**
     * Initializes the updated  object validation.
     *
     * @return the initialized updated  object validation
     */
    public static ObjectValidation initUpdatedObjectValidation() {
        ObjectValidation result = new ObjectValidation();
        result.setName(UPDATED_STRING);
        result.setStatus(UPDATED_STRING);
        result.setEnabled(UPDATED_BOOLEAN);
        result.setValidFor(UPDATED_TIME_PERIOD);
        return result;
    }

    /**
     * Initializes the default required characteristic.
     *
     * @return the initialized default required characteristic
     */
    public static Characteristic initDefaultRequiredCharacteristic() {
        Characteristic result = new Characteristic();
        result.setKey(DEFAULT_STRING);
        result.setValue(DEFAULT_STRING);
        result.setDataType(DEFAULT_DATA_TYPE.name());
        return result;
    }

    /**
     * Initializes the updated  characteristic.
     *
     * @return the initialized updated required characteristic
     */
    public static Characteristic initUpdatedRequiredCharacteristic() {
        Characteristic result = new Characteristic();
        result.setKey(UPDATED_STRING);
        result.setValue(UPDATED_STRING);
        result.setDataType(UPDATED_DATA_TYPE.name());
        return result;
    }

    /**
     * Updates the provided mandatory characteristic with updated values.
     *
     * @param characteristic the mandatory characteristic to update
     */
    public static void UPDATED_MANDATORY_CHARACTERISTIC(Characteristic characteristic) {
        characteristic.setKey(UPDATED_STRING);
        characteristic.setDataType(UPDATED_DATA_TYPE.name());
    }

    /**
     * Updates the provided sorted set of mandatory characteristics with updated values.
     *
     * @param characteristics the sorted set of mandatory characteristics to update
     */
    public static void UPDATED_MANDATORY_CHARACTERISTICS(SortedSet<Characteristic> characteristics) {
        characteristics.forEach(ManakCoreTestData::UPDATED_MANDATORY_CHARACTERISTIC);
    }

    /**
     * Initializes the default characteristic.
     *
     * @return the initialized default characteristic
     */
    public static Characteristic initDefaultCharacteristic() {
        Characteristic result = initDefaultRequiredCharacteristic();
        result.setValue(DEFAULT_STRING);
        return result;
    }

    /**
     * Initializes the updated characteristic.
     *
     * @return the initialized updated characteristic
     */
    public static Characteristic initUpdatedCharacteristic() {
        Characteristic result = initUpdatedRequiredCharacteristic();
        result.setValue(UPDATED_STRING);
        return result;
    }

    /**
     * Updates the provided characteristic with updated values.
     *
     * @param characteristic the characteristic to update
     */
    public static void UPDATED_CHARACTERISTIC(Characteristic characteristic) {
        UPDATED_MANDATORY_CHARACTERISTIC(characteristic);
        characteristic.setValue(UPDATED_INTEGER);
    }

    /**
     * Updates the provided sorted set of characteristics with updated values.
     *
     * @param characteristics the sorted set of characteristics to update
     */
    public static void UPDATED_CHARACTERISTICS(SortedSet<Characteristic> characteristics) {
        characteristics.forEach(ManakCoreTestData::UPDATED_CHARACTERISTIC);
    }

    /**
     * Updates the provided sorted set of childdomain domains with updated values.
     *
     * @param relatedDomains the sorted set of childdomain domains to update
     */
    public static void UPDATED_RELATED_DOMAINS(SortedSet<RelatedDomain> relatedDomains) {
        relatedDomains.forEach(ManakCoreTestData::UPDATED_RELATED_DOMAIN);
    }

    /**
     * Returns a sorted set of default required childdomain parties.
     *
     * @return a sorted set of default required childdomain parties
     */
    public static SortedSet<RelatedParty> DEFAULT_REQUIRED_RELATED_PARTIES() {
        return Sets.newTreeSet(Collections.singleton((RelatedParty) DEFAULT_REQUIRED_RELATED_PARTY));
    }

    /**
     * Updates the provided sorted set of childdomain parties with updated values.
     *
     * @param relatedParties the sorted set of childdomain parties to update
     */
    public static void UPDATED_REQUIRED_RELATED_PARTIES(SortedSet<RelatedParty> relatedParties) {
        relatedParties.forEach(ManakCoreTestData::UPDATED_REQUIRED_RELATED_PARTY);
    }

    /**
     * Returns a sorted set of default childdomain parties.
     *
     * @return a sorted set of default childdomain parties
     */
    public static SortedSet<RelatedParty> DEFAULT_RELATED_PARTIES() {
        return Sets.newTreeSet(Collections.singleton((RelatedParty) DEFAULT_RELATED_PARTY));
    }

    /**
     * Updates the provided sorted set of childdomain parties with updated values.
     *
     * @param relatedParties the sorted set of childdomain parties to update
     */
    public static void UPDATED_RELATED_PARTIES(SortedSet<RelatedParty> relatedParties) {
        relatedParties.forEach(ManakCoreTestData::UPDATED_RELATED_PARTY);
    }

    /**
     * Returns a sorted set of default required childdomain domains.
     *
     * @return a sorted set of default required childdomain domains
     */
    public static SortedSet<RelatedDomain> DEFAULT_REQUIRED_RELATED_DOMAINS() {
        return Sets.newTreeSet(Collections.singleton((RelatedDomain) DEFAULT_REQUIRED_RELATED_DOMAIN));
    }

    /**
     * Updates the provided sorted set of childdomain domains with updated values.
     *
     * @param relatedDomains the sorted set of childdomain domains to update
     */
    public static void UPDATED_REQUIRED_RELATED_DOMAINS(SortedSet<RelatedDomain> relatedDomains) {
        relatedDomains.forEach(ManakCoreTestData::UPDATED_REQUIRED_RELATED_DOMAIN);
    }

    /**
     * Returns a sorted set of default childdomain domains.
     *
     * @return a sorted set of default childdomain domains
     */
    public static SortedSet<RelatedDomain> DEFAULT_RELATED_DOMAINS() {
        return Sets.newTreeSet(Collections.singleton((RelatedDomain) DEFAULT_RELATED_DOMAIN));
    }


    public static void assertCharacteristic(Characteristic before, Characteristic after) {
        Assertions.assertThat(after.getKey()).isEqualTo(before.getKey());
        Assertions.assertThat(after.getValue()).isEqualTo(before.getValue());
        Assertions.assertThat(after.getDataType()).isEqualTo(before.getDataType());
    }

    public static void assertObjectValidation(ObjectValidation before, ObjectValidation after) {
        Assertions.assertThat(after.getName()).isEqualTo(before.getName());
        Assertions.assertThat(after.getStatus()).isEqualTo(before.getStatus());
        Assertions.assertThat(after.getEnabled()).isEqualTo(before.getEnabled());
        Assertions.assertThat(after.getValidFor()).isEqualTo(before.getValidFor());
    }

    public static void assertRelatedAction(RelatedAction before, RelatedAction after) {
        Assertions.assertThat(after.getName()).isEqualTo(before.getName());
        Assertions.assertThat(after.getStatus()).isEqualTo(before.getStatus());
        Assertions.assertThat(after.getMandatory()).isEqualTo(before.getMandatory());
        Assertions.assertThat(after.getValidFor()).isEqualTo(before.getValidFor());
    }
}
