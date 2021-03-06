/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 */

package com.microsoft.azure.management.resources.fluentcore.arm.models;

import com.microsoft.azure.management.apigeneration.Fluent;
import com.microsoft.azure.management.resources.fluentcore.model.Creatable;

/**
 * Interface for the child resource which can be CRUDed independently from the parent resource.
 */
@Fluent
public interface IndependentChild
        extends HasName, HasId, HasResourceGroup {

    /**
     * Grouping of all the definition stages.
     */
    interface DefinitionStages {
        /**
         * A resource definition allowing a new resource group to be created.
         *
         * @param <T> the resource type.
         * @param <ParentT> parent resource type.
         */
        interface WithParentResource<T, ParentT> {
            /**
             * Creates a new child resource under parent resource.
             *
             * @param groupName the name of the resource group for parent resource.
             * @param parentName the name of the parent resource.
             * @return the creatable for the child resource
             */
            Creatable<T> withExistingParentResource(String groupName, String parentName);

            /**
             * Creates a new child resource under parent resource.
             *
             * @param parentResourceCreatable a creatable definition for the parent resource
             * @return the creatable for the child resource
             */
            Creatable<T> withNewParentResource(Creatable<ParentT> parentResourceCreatable);

            /**
             * Creates a new child resource under parent resource.
             *
             * @param existingParentResource the parent resource under which this resource to be created.
             * @return the creatable for the child resource
             */
            Creatable<T> withExistingParentResource(ParentT existingParentResource);
        }
    }

}
