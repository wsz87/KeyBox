/**
 * Copyright 2015 Sean Kavanagh - sean.p.kavanagh6@gmail.com
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.keybox.manage.util;

import com.keybox.common.util.AppConfig;

public class OpenStackUtils {

    public static final String OPENSTACK_SERVER_API = AppConfig.getProperty("openStackServerAPI");
    public static final String OPENSTACK_DOMAIN_NM = AppConfig.getProperty("openStackDomainName");
    public static final String OPENSTACK_PROJECT_ID= AppConfig.getProperty("openStackProjectID");

}