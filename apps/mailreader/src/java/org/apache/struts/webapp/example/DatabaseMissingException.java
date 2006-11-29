/*
 * $Header: /home/jerenkrantz/tmp/commons/commons-convert/cvs/home/cvs/jakarta-commons//chain/apps/mailreader/src/java/org/apache/struts/webapp/example/DatabaseMissingException.java,v 1.1 2004/03/25 12:42:03 husted Exp $
 * $Revision$
 * $Date$
 *
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements.  See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License.  You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.apache.struts.webapp.example;

import org.apache.struts.util.ModuleException;

/**
 * <p>Indicates that reference to database dissappeared.</p>
 */
public class DatabaseMissingException extends ModuleException {


    /**
     * <p>Construct a new instance of this exception.</p>
     */
    public DatabaseMissingException() {
        super("error.database.missing");
    }

}

