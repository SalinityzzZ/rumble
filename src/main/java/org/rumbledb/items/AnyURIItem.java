/*
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements. See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License. You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 *
 * Authors: Stefan Irimescu, Can Berker Cikis
 *
 */

package org.rumbledb.items;

import com.esotericsoftware.kryo.Kryo;
import com.esotericsoftware.kryo.io.Input;
import com.esotericsoftware.kryo.io.Output;
import org.rumbledb.api.Item;
import org.rumbledb.exceptions.ExceptionMetadata;
import org.rumbledb.exceptions.IteratorFlowException;
import org.rumbledb.exceptions.UnexpectedTypeException;
import org.rumbledb.expressions.operational.base.OperationalExpressionBase;
import sparksoniq.semantics.types.AtomicTypes;
import sparksoniq.semantics.types.ItemType;
import sparksoniq.semantics.types.ItemTypes;

import java.net.URI;
import java.net.URISyntaxException;

public class AnyURIItem extends AtomicItem {


    private static final long serialVersionUID = 1L;
    private URI value;

    public AnyURIItem() {
        super();
    }

    public AnyURIItem(URI value) {
        super();
        this.value = value;
    }

    @Override
    public String getStringValue() {
        return this.getValue().toString();
    }

    @Override
    public boolean getEffectiveBooleanValue() {
        return !this.getStringValue().isEmpty();
    }

    @Override
    public boolean equals(Object otherItem) {
        if (!(otherItem instanceof Item)) {
            return false;
        }
        Item o = (Item) otherItem;
        if (!o.isAnyURI()) {
            return false;
        }
        return (getStringValue().equals(o.getStringValue()));
    }

    @Override
    public int compareTo(Item other) {

    }

    @Override
    public int hashCode() {
        return this.getValue().hashCode();
    }

    public URI getValue() {
        return this.value;
    }

    @Override
    public Item castAs(AtomicTypes itemType) {
        return this;
    }

    @Override
    public boolean isCastableAs(AtomicTypes itemType) {
        return true;
    }

    @Override
    public String serialize() {
        return null;
    }

    @Override
    public void write(Kryo kryo, Output output) {

    }

    @Override
    public void read(Kryo kryo, Input input) {

    }

    @Override
    public boolean isAnyURI() {
        return true;
    }
}
