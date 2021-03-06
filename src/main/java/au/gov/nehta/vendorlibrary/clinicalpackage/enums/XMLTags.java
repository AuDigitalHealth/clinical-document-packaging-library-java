/*
 * Copyright 2012 NEHTA
 *
 * Licensed under the NEHTA Open Source (Apache) License; you may not use this
 * file except in compliance with the License. A copy of the License is in the
 * 'license.txt' file, which should be provided with this work.
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS, WITHOUT
 * WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the
 * License for the specific language governing permissions and limitations
 * under the License.
 */
package au.gov.nehta.vendorlibrary.clinicalpackage.enums;

/**
 * {@link XMLTags}
 * XML tag names.
 */
public enum XMLTags {

    /**
     * Digital signature manifest tag name.
     */
    DS_MANIFEST("Manifest"),

    /**
     * Digital signature reference tag name.
     */
    DS_REFERENCE("Reference"),

    /**
     * Digital signature digest method tag name.
     */
    DS_DIGEST_METHOD("DigestMethod"),

    /**
     * Digital signature digest value tag name.
     */
    DS_DIGEST_VALUE("DigestValue");

    private final String name;

    XMLTags(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
