/*******************************************************************************
 * Copyright  (c) 2015-2016, WSO2.Telco Inc. (http://www.wso2telco.com) All Rights Reserved.
 * 
 * WSO2.Telco Inc. licences this file to you under  the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * 
 *   http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 ******************************************************************************/
package com.wso2telco.services.dep.sandbox.dao;

import java.util.List;

import com.wso2telco.services.dep.sandbox.dao.model.domain.AttributeDistribution;
import com.wso2telco.services.dep.sandbox.dao.model.domain.AttributeValues;

public interface WalletDAO {
	
	public List<AttributeValues> getTransactionValue(String endUserId, List<String> attribute, String serviceCall) throws Exception;
	public String getAttributeValue(String endUserId, String serviceCall, String attribute) throws Exception;
	public Double checkBalance (String msisdn) throws Exception;
	public boolean updateBalance(String msisdn, Double updateBalance) throws Exception;
	public AttributeDistribution getDistributionValue(String serviceCall, String attributeName, String apiType) throws Exception; 
	public Integer getNumber(String endUserId) throws Exception;
	public AttributeValues getAttributeValue(AttributeDistribution distributionObj, Integer endUserId) throws Exception;
	public boolean checkDuplicateValue(String endUserId, String serviceCall, String value, String attributeName) throws Exception;
	public AttributeValues checkClientCorrelator(String endUserId, String serviceCall, String clientCorrelator) throws Exception;
}
