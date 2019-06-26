/**
 * (C) Copyright IBM Corp. 2019
 *
 * SPDX-License-Identifier: Apache-2.0
 */

package com.ibm.watsonhealth.fhir.model.type;

import java.util.Collection;

public class ReferenceVersionRules extends Code {
    /**
     * Either Specific or independent
     */
    public static final ReferenceVersionRules EITHER = ReferenceVersionRules.of(ValueSet.EITHER);

    /**
     * Version independent
     */
    public static final ReferenceVersionRules INDEPENDENT = ReferenceVersionRules.of(ValueSet.INDEPENDENT);

    /**
     * Version Specific
     */
    public static final ReferenceVersionRules SPECIFIC = ReferenceVersionRules.of(ValueSet.SPECIFIC);

    private ReferenceVersionRules(Builder builder) {
        super(builder);
    }

    public static ReferenceVersionRules of(java.lang.String value) {
        return ReferenceVersionRules.builder().value(value).build();
    }

    public static ReferenceVersionRules of(ValueSet value) {
        return ReferenceVersionRules.builder().value(value).build();
    }

    public static Builder builder() {
        return new Builder();
    }

    public Builder toBuilder() {
        Builder builder = new Builder();
        builder.id = id;
        builder.extension.addAll(extension);
        builder.value = value;
        return builder;
    }

    public static class Builder extends Code.Builder {
        private Builder() {
            super();
        }

        @Override
        public Builder id(java.lang.String id) {
            return (Builder) super.id(id);
        }

        @Override
        public Builder extension(Extension... extension) {
            return (Builder) super.extension(extension);
        }

        @Override
        public Builder extension(Collection<Extension> extension) {
            return (Builder) super.extension(extension);
        }

        @Override
        public Builder value(java.lang.String value) {
            return (Builder) super.value(ValueSet.from(value).value());
        }

        public Builder value(ValueSet value) {
            return (Builder) super.value(value.value());
        }

        @Override
        public ReferenceVersionRules build() {
            return new ReferenceVersionRules(this);
        }
    }

    public enum ValueSet {
        /**
         * Either Specific or independent
         */
        EITHER("either"),

        /**
         * Version independent
         */
        INDEPENDENT("independent"),

        /**
         * Version Specific
         */
        SPECIFIC("specific");

        private final java.lang.String value;

        ValueSet(java.lang.String value) {
            this.value = value;
        }

        public java.lang.String value() {
            return value;
        }

        public static ValueSet from(java.lang.String value) {
            for (ValueSet c : ValueSet.values()) {
                if (c.value.equals(value)) {
                    return c;
                }
            }
            throw new IllegalArgumentException(value);
        }
    }
}