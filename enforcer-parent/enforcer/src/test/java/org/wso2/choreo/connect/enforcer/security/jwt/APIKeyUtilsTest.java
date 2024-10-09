/*
 * Copyright (c) 2024, WSO2 LLC. (https://www.wso2.com)
 *
 * WSO2 LLC. licenses this file to you under the Apache License,
 * Version 2.0 (the "License"); you may not use this file except
 * in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied. See the License for the
 * specific language governing permissions and limitations
 * under the License.
 */

package org.wso2.choreo.connect.enforcer.security.jwt;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.powermock.core.classloader.annotations.PrepareForTest;
import org.powermock.modules.junit4.PowerMockRunner;
import org.wso2.choreo.connect.enforcer.config.ConfigHolder;

@RunWith(PowerMockRunner.class)
@PrepareForTest({ConfigHolder.class})
public class APIKeyUtilsTest {

    @Test
    public void testIsValidAPIKey_valid() {

        String apiKey = "chp_eyJrZXkiOiJieTlpYXQ5d3MycDY0dWF6anFkbzQ4cnAyYnY3aWoxdWRuYmRzNzN6ZWx5OWNoZHJ2YiJ97JYPAg";

        Assert.assertTrue(APIKeyUtils.isValidAPIKey(apiKey));
    }

    @Test
    public void testIsValidAPIKey_invalid() {

        String apiKey = "chp_sdkflk";
        Assert.assertTrue(!APIKeyUtils.isValidAPIKey(apiKey));
    }

    @Test
    public void testGenerateAPIKeyHash() {
        String apiKey = "chp_eyJrZXkiOiJlanp6am8yaGc5MnA2MTF6NTI2OXMzNzU1ZnJzbnFlNm9vb2hldWd0djBjbmQ3bXdobCJ9dknDJA";
        String expectedKeyHash = "62f73948188c9f773414d4ec77eae6e8caab21556e4ad18f94b7c6c5b018524c";
        String generatedAPIKeyHash = APIKeyUtils.generateAPIKeyHash(apiKey);
        Assert.assertEquals(expectedKeyHash, generatedAPIKeyHash);
    }
}