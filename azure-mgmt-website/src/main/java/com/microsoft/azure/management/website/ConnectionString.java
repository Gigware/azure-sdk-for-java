/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 */

package com.microsoft.azure.management.website;

/**
 * An immutable client-side representation of a connection string on a web app.
 */
public interface ConnectionString {
    /**
     * @return the key of the setting
     */
    String name();

    /**
     * @return the value of the connection string
     */
    String value();

    /**
     * @return the type of the connection string
     */
    ConnectionStringType type();

    /**
     * @return if the connection string sticks to the slot during a swap
     */
    boolean sticky();
}
