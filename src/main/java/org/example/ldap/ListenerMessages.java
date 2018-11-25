/*
 * Copyright 2018 Ping Identity Corporation
 * All Rights Reserved.
 */
/*
 * Copyright (C) 2018 Ping Identity Corporation
 *
 * This program is free software; you can redistribute it and/or modify
 * it under the terms of the GNU General Public License (GPLv2 only)
 * or the terms of the GNU Lesser General Public License (LGPLv2.1 only)
 * as published by the Free Software Foundation.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program; if not, see <http://www.gnu.org/licenses>.
 */
package org.example.ldap;



import java.text.MessageFormat;
import java.util.ResourceBundle;
import java.util.concurrent.ConcurrentHashMap;


/**
 * This enum defines a set of message keys for messages in the
 * com.unboundid.ldap.listener package, which correspond to messages in the
 * unboundid-ldapsdk-listener.properties properties file.
 * <BR><BR>
 * This source file was generated from the properties file.
 * Do not edit it directly.
 */
enum ListenerMessages
{
  /**
   * Unable to process an encoded password because the encoded password bytes are expected to be base64-encoded, but an error was encountered while trying to base64-decode the value.
   */
  ERR_BASE64_PW_FORMATTER_CANNOT_DECODE("Unable to process an encoded password because the encoded password bytes are expected to be base64-encoded, but an error was encountered while trying to base64-decode the value."),



  /**
   * Unable to acquire a concurrent operation permit for the {0} operation because none were immediately available.
   */
  ERR_CONCURRENT_LIMITER_REQUEST_HANDLER_NO_TIMEOUT("Unable to acquire a concurrent operation permit for the {0} operation because none were immediately available."),



  /**
   * Unable to acquire concurrent operation permit for the {0} operation:  {1}
   */
  ERR_CONCURRENT_LIMITER_REQUEST_HANDLER_SEMAPHORE_EXCEPTION("Unable to acquire concurrent operation permit for the {0} operation:  {1}"),



  /**
   * Unable to acquire a concurrent operation permit for the {0} operation within the configured reject timeout of {1} milliseconds.
   */
  ERR_CONCURRENT_LIMITER_REQUEST_HANDLER_TIMEOUT("Unable to acquire a concurrent operation permit for the {0} operation within the configured reject timeout of {1} milliseconds."),



  /**
   * An error occurred while attempting to convert the connection to use TLS encryption:  {0}
   */
  ERR_CONN_CONVERT_TO_TLS_FAILURE("An error occurred while attempting to convert the connection to use TLS encryption:  {0}"),



  /**
   * An error occurred while attempting to prepare for communication with the client:  {0}
   */
  ERR_CONN_CREATE_IO_EXCEPTION("An error occurred while attempting to prepare for communication with the client:  {0}"),



  /**
   * An unexpected error occurred while invoking the request handler to handle request {0}:  {1}
   */
  ERR_CONN_EXCEPTION_IN_REQUEST_HANDLER("An unexpected error occurred while invoking the request handler to handle request {0}:  {1}"),



  /**
   * An exception was thrown by an intermediate response transformer of type {0} while processing intermediate response {1}:  {2}
   */
  ERR_CONN_INTERMEDIATE_RESPONSE_TRANSFORMER_EXCEPTION("An exception was thrown by an intermediate response transformer of type {0} while processing intermediate response {1}:  {2}"),



  /**
   * The client sent a request with an invalid protocol op type of {0}.
   */
  ERR_CONN_INVALID_PROTOCOL_OP_TYPE("The client sent a request with an invalid protocol op type of {0}."),



  /**
   * An unexpected exception was thrown while attempting to process the requested operation:  {0}
   */
  ERR_CONN_REQUEST_HANDLER_FAILURE("An unexpected exception was thrown while attempting to process the requested operation:  {0}"),



  /**
   * An exception was thrown by a search entry transformer of type {0} while processing entry {1}:  {2}
   */
  ERR_CONN_SEARCH_ENTRY_TRANSFORMER_EXCEPTION("An exception was thrown by a search entry transformer of type {0} while processing entry {1}:  {2}"),



  /**
   * An exception was thrown by a search reference transformer of type {0} while processing reference {1}:  {2}
   */
  ERR_CONN_SEARCH_REFERENCE_TRANSFORMER_EXCEPTION("An exception was thrown by a search reference transformer of type {0} while processing reference {1}:  {2}"),



  /**
   * An error occurred while attempting to send a response to the client:  {0}
   */
  ERR_CONN_SEND_MESSAGE_EXCEPTION("An error occurred while attempting to send a response to the client:  {0}"),



  /**
   * The request included multiple controls with OID ''{0}'' but at most one control with that OID may be included in a request.
   */
  ERR_CONTROL_PROCESSOR_MULTIPLE_CONTROLS("The request included multiple controls with OID ''{0}'' but at most one control with that OID may be included in a request."),



  /**
   * The request included multiple conflicting proxied authorization controls.
   */
  ERR_CONTROL_PROCESSOR_MULTIPLE_PROXY_CONTROLS("The request included multiple conflicting proxied authorization controls."),



  /**
   * No changes were applied because the request included the no-operation control.
   */
  ERR_CONTROL_PROCESSOR_NO_OPERATION("No changes were applied because the request included the no-operation control."),



  /**
   * The control with OID ''{0}'' is not supported by the in-memory request processor.
   */
  ERR_CONTROL_PROCESSOR_UNSUPPORTED_CONTROL("The control with OID ''{0}'' is not supported by the in-memory request processor."),



  /**
   * The control with OID ''{0}'' is not supported for use in conjunction with the requested operation type.
   */
  ERR_CONTROL_PROCESSOR_UNSUPPORTED_FOR_OP("The control with OID ''{0}'' is not supported for use in conjunction with the requested operation type."),



  /**
   * The simple paged results and virtual list view controls may not both be included in the same search request.
   */
  ERR_CONTROL_PROCESSOR_VLV_AND_PAGED_RESULTS("The simple paged results and virtual list view controls may not both be included in the same search request."),



  /**
   * The server-side sort request control must be provided in any search request that contains the virtual list view request control.
   */
  ERR_CONTROL_PROCESSOR_VLV_WITHOUT_SORT("The server-side sort request control must be provided in any search request that contains the virtual list view request control."),



  /**
   * Unable to configure an equality index for attribute ''{0}'' because the server is not configured with schema.
   */
  ERR_DS_EQ_INDEX_NO_SCHEMA("Unable to configure an equality index for attribute ''{0}'' because the server is not configured with schema."),



  /**
   * Unable to configure an equality index for attribute ''{0}'' because that attribute type is not defined in the server schema.
   */
  ERR_DS_EQ_INDEX_UNDEFINED_ATTRIBUTE_TYPE("Unable to configure an equality index for attribute ''{0}'' because that attribute type is not defined in the server schema."),



  /**
   * Unable to process an encoded password because the encoded password bytes are expected to be formatted in hexadecimal, but an error was encountered while trying to parse the value as a hex string.
   */
  ERR_HEX_PW_FORMATTER_CANNOT_DECODE("Unable to process an encoded password because the encoded password bytes are expected to be formatted in hexadecimal, but an error was encountered while trying to parse the value as a hex string."),



  /**
   * Unable to accept a new connection because the LDAP listener already has the maximum of {0} connections established.
   */
  ERR_LDAP_LISTENER_MAX_CONNECTIONS_ESTABLISHED("Unable to accept a new connection because the LDAP listener already has the maximum of {0} connections established."),



  /**
   * An error occurred while attempting to create an SSL client socket factory:  {0}
   */
  ERR_LISTENER_CFG_COULD_NOT_CREATE_SSL_SOCKET_FACTORY("An error occurred while attempting to create an SSL client socket factory:  {0}"),



  /**
   * The provided listener port value {0,number,0} was invalid.  The value must be between 1 and 65535, or it may be zero to indicate that the server should automatically select a listen port.
   */
  ERR_LISTENER_CFG_INVALID_PORT("The provided listener port value {0,number,0} was invalid.  The value must be between 1 and 65535, or it may be zero to indicate that the server should automatically select a listen port."),



  /**
   * The provided listener name was null or empty.
   */
  ERR_LISTENER_CFG_NO_NAME("The provided listener name was null or empty."),



  /**
   * The provided SSL server socket factory was null.
   */
  ERR_LISTENER_CFG_NO_SSL_SERVER_SOCKET_FACTORY("The provided SSL server socket factory was null."),



  /**
   * An error occurred while attempting to parse the provided set of LDIF lines as a set of entries:  {0}
   */
  ERR_MEM_DS_ADD_ENTRIES_LDIF_PARSE_EXCEPTION("An error occurred while attempting to parse the provided set of LDIF lines as a set of entries:  {0}"),



  /**
   * An error occurred while attempting to parse the provided set of LDIF lines as an entry:  {0}
   */
  ERR_MEM_DS_ADD_ENTRY_LDIF_PARSE_EXCEPTION("An error occurred while attempting to parse the provided set of LDIF lines as an entry:  {0}"),



  /**
   * An error was encountered while attempting to open file ''{0}'' for use as a code log:  {1}
   */
  ERR_MEM_DS_CANNOT_OPEN_CODE_LOG("An error was encountered while attempting to open file ''{0}'' for use as a code log:  {1}"),



  /**
   * Two or more of the provided listener configurations had the same name of ''{0}''.
   */
  ERR_MEM_DS_CFG_CONFLICTING_LISTENER_NAMES("Two or more of the provided listener configurations had the same name of ''{0}''."),



  /**
   * Unable to use {0} as the listen port because it is outside the acceptable range of 1-65535 for explicitly-defined listen ports, or 0 for an automatically-determined listen port.
   */
  ERR_MEM_DS_CFG_INVALID_LISTEN_PORT("Unable to use {0} as the listen port because it is outside the acceptable range of 1-65535 for explicitly-defined listen ports, or 0 for an automatically-determined listen port."),



  /**
   * Base DN ''{0}'' cannot be parsed as a valid DN:  {1}
   */
  ERR_MEM_DS_CFG_MALFORMED_BASE_DN("Base DN ''{0}'' cannot be parsed as a valid DN:  {1}"),



  /**
   * The in-memory directory server must be configured with at least one base DN.
   */
  ERR_MEM_DS_CFG_NO_BASE_DNS("The in-memory directory server must be configured with at least one base DN."),



  /**
   * At least one listener configuration must be defined for the in-memory directory server.
   */
  ERR_MEM_DS_CFG_NO_LISTENERS("At least one listener configuration must be defined for the in-memory directory server."),



  /**
   * An additional bind DN must not be null or represent the null DN.
   */
  ERR_MEM_DS_CFG_NULL_ADDITIONAL_BIND_DN("An additional bind DN must not be null or represent the null DN."),



  /**
   * An additional bind password must not be null or empty.
   */
  ERR_MEM_DS_CFG_NULL_ADDITIONAL_BIND_PW("An additional bind password must not be null or empty."),



  /**
   * Multiple password encoders are configured with the same prefix of ''{0}''.
   */
  ERR_MEM_DS_CFG_PW_ENCODER_CONFLICT("Multiple password encoders are configured with the same prefix of ''{0}''."),



  /**
   * An error occurred while attempting to create an LDIF writer for file ''{0}'':  {1}
   */
  ERR_MEM_DS_EXPORT_TO_LDIF_CANNOT_CREATE_WRITER("An error occurred while attempting to create an LDIF writer for file ''{0}'':  {1}"),



  /**
   * Unable to establish a connection to the in-memory directory server because listener ''{0}'' is not running.
   */
  ERR_MEM_DS_GET_CONNECTION_LISTENER_NOT_RUNNING("Unable to establish a connection to the in-memory directory server because listener ''{0}'' is not running."),



  /**
   * Unable to establish a connection to the in-memory directory server because none of the configured listeners are running.
   */
  ERR_MEM_DS_GET_CONNECTION_NO_LISTENERS("Unable to establish a connection to the in-memory directory server because none of the configured listeners are running."),



  /**
   * An error occurred while attempting to create an LDIF reader for file ''{0}'':  {1}
   */
  ERR_MEM_DS_INIT_FROM_LDIF_CANNOT_CREATE_READER("An error occurred while attempting to create an LDIF reader for file ''{0}'':  {1}"),



  /**
   * An error occurred while attempting to parse the provided set of LDIF lines as a modification:  {0}
   */
  ERR_MEM_DS_MODIFY_ENTRY_LDIF_PARSE_EXCEPTION("An error occurred while attempting to parse the provided set of LDIF lines as a modification:  {0}"),



  /**
   * Listener ''{0}'' is not configured for use with the directory server.
   */
  ERR_MEM_DS_NO_SUCH_LISTENER("Listener ''{0}'' is not configured for use with the directory server."),



  /**
   * An error occurred while attempting to start listener ''{0}'':  {1}
   */
  ERR_MEM_DS_START_FAILED("An error occurred while attempting to start listener ''{0}'':  {1}"),



  /**
   * A client connection was terminated as a result of an LDAP exception encountered during processing:  {0}
   */
  ERR_MEM_DS_TOOL_CONNECTION_TERMINATED_BY_EXCEPTION("A client connection was terminated as a result of an LDAP exception encountered during processing:  {0}"),



  /**
   * An error occurred while attempting to accept a client connection:  {0}
   */
  ERR_MEM_DS_TOOL_ERROR_ACCEPTING_CONNECTION("An error occurred while attempting to accept a client connection:  {0}"),



  /**
   * An error occurred while attempting to initialize the log file handler for file ''{0}'':  {1}
   */
  ERR_MEM_DS_TOOL_ERROR_CREATING_LOG_HANDLER("An error occurred while attempting to initialize the log file handler for file ''{0}'':  {1}"),



  /**
   * An error occurred while attempting to create a directory server instance using the provided configuration:  {0}
   */
  ERR_MEM_DS_TOOL_ERROR_CREATING_SERVER_INSTANCE("An error occurred while attempting to create a directory server instance using the provided configuration:  {0}"),



  /**
   * An error occurred while attempting to initialize the directory server configuration:  {0}
   */
  ERR_MEM_DS_TOOL_ERROR_INITIALIZING_CONFIG("An error occurred while attempting to initialize the directory server configuration:  {0}"),



  /**
   * An error occurred while attempting to initialize the SSL client or server socket factory:  {0}
   */
  ERR_MEM_DS_TOOL_ERROR_INITIALIZING_SSL("An error occurred while attempting to initialize the SSL client or server socket factory:  {0}"),



  /**
   * An error occurred while attempting to populate the server with data from ''{0}'':  {1}
   */
  ERR_MEM_DS_TOOL_ERROR_POPULATING_SERVER_INSTANCE("An error occurred while attempting to populate the server with data from ''{0}'':  {1}"),



  /**
   * An error occurred while attempting to read schema definitions from file(s) ''{0}'':  {1}
   */
  ERR_MEM_DS_TOOL_ERROR_READING_SCHEMA("An error occurred while attempting to read schema definitions from file(s) ''{0}'':  {1}"),



  /**
   * An error occurred while attempting to start the server:  {0}
   */
  ERR_MEM_DS_TOOL_ERROR_STARTING_SERVER("An error occurred while attempting to start the server:  {0}"),



  /**
   * The in-memory directory server was configured to use schema from ''{0}'' which does not exist.
   */
  ERR_MEM_DS_TOOL_NO_SUCH_SCHEMA_FILE("The in-memory directory server was configured to use schema from ''{0}'' which does not exist."),



  /**
   * The provided bind request is not supported when accessing the in-memory directory server without a connection.
   */
  ERR_MEM_DS_UNSUPPORTED_BIND_TYPE("The provided bind request is not supported when accessing the in-memory directory server without a connection."),



  /**
   * An entry with DN ''{0}'' already exists in the server.
   */
  ERR_MEM_HANDLER_ADD_ALREADY_EXISTS("An entry with DN ''{0}'' already exists in the server."),



  /**
   * Unable to add an entry with a DN that is the same as or subordinate to the changelog base DN ''{0}''.
   */
  ERR_MEM_HANDLER_ADD_CHANGELOG("Unable to add an entry with a DN that is the same as or subordinate to the changelog base DN ''{0}''."),



  /**
   * Unable to add entry ''{0}'' because it includes attribute {1} which is declared with NO-USER-MODIFICATION in the schema.
   */
  ERR_MEM_HANDLER_ADD_CONTAINS_NO_USER_MOD("Unable to add entry ''{0}'' because it includes attribute {1} which is declared with NO-USER-MODIFICATION in the schema."),



  /**
   * Unable to add entry ''{0}'' because an error occurred while attempting to parse the DN:  {1}
   */
  ERR_MEM_HANDLER_ADD_MALFORMED_DN("Unable to add entry ''{0}'' because an error occurred while attempting to parse the DN:  {1}"),



  /**
   * Unable to add entry ''{0}'' because its parent entry ''{1}'' does not exist in the server.
   */
  ERR_MEM_HANDLER_ADD_MISSING_PARENT("Unable to add entry ''{0}'' because its parent entry ''{1}'' does not exist in the server."),



  /**
   * The server has been configured to reject all add requests.
   */
  ERR_MEM_HANDLER_ADD_NOT_ALLOWED("The server has been configured to reject all add requests."),



  /**
   * The server has been configured to only allow add operations for authenticated clients.
   */
  ERR_MEM_HANDLER_ADD_REQUIRES_AUTH("The server has been configured to only allow add operations for authenticated clients."),



  /**
   * Unable to add an entry with the null DN.
   */
  ERR_MEM_HANDLER_ADD_ROOT_DSE("Unable to add an entry with the null DN."),



  /**
   * Unable to add an entry with a DN that is the same as or subordinate to the subschema subentry DN ''{0}''.
   */
  ERR_MEM_HANDLER_ADD_SCHEMA("Unable to add an entry with a DN that is the same as or subordinate to the subschema subentry DN ''{0}''."),



  /**
   * Unable to add entry ''{0}'' because it violates the provided schema:  {1}
   */
  ERR_MEM_HANDLER_ADD_VIOLATES_SCHEMA("Unable to add entry ''{0}'' because it violates the provided schema:  {1}"),



  /**
   * The target entry did not match the filter contained in the assertion request control.
   */
  ERR_MEM_HANDLER_ASSERTION_CONTROL_NOT_SATISFIED("The target entry did not match the filter contained in the assertion request control."),



  /**
   * Unable to parse bind DN ''{0}'':  {1}
   */
  ERR_MEM_HANDLER_BIND_MALFORMED_DN("Unable to parse bind DN ''{0}'':  {1}"),



  /**
   * The server has been configured to reject all bind requests.
   */
  ERR_MEM_HANDLER_BIND_NOT_ALLOWED("The server has been configured to reject all bind requests."),



  /**
   * Unable to bind as user ''{0}'' because no such entry exists in the server.
   */
  ERR_MEM_HANDLER_BIND_NO_SUCH_USER("Unable to bind as user ''{0}'' because no such entry exists in the server."),



  /**
   * The server has been configured to only allow bind operations that result in authenticated connections.  Anonymous bind operations are not allowed.
   */
  ERR_MEM_HANDLER_BIND_REQUIRES_AUTH("The server has been configured to only allow bind operations that result in authenticated connections.  Anonymous bind operations are not allowed."),



  /**
   * Simple authentication with a non-empty DN and an empty password is not allowed.
   */
  ERR_MEM_HANDLER_BIND_SIMPLE_DN_WITHOUT_PASSWORD("Simple authentication with a non-empty DN and an empty password is not allowed."),



  /**
   * Unable to bind as user ''{0}'' because the provided password was incorrect.
   */
  ERR_MEM_HANDLER_BIND_WRONG_PASSWORD("Unable to bind as user ''{0}'' because the provided password was incorrect."),



  /**
   * Unable to use ''{0}'' as a base DN for the in-memory request handler because it conflicts with the base DN used for changelog entries.
   */
  ERR_MEM_HANDLER_CHANGELOG_BASE_DN("Unable to use ''{0}'' as a base DN for the in-memory request handler because it conflicts with the base DN used for changelog entries."),



  /**
   * Unable to process the compare operation because an error occurred while attempting to parse target DN ''{0}'':  {1}
   */
  ERR_MEM_HANDLER_COMPARE_MALFORMED_DN("Unable to process the compare operation because an error occurred while attempting to parse target DN ''{0}'':  {1}"),



  /**
   * The server has been configured to reject all compare requests.
   */
  ERR_MEM_HANDLER_COMPARE_NOT_ALLOWED("The server has been configured to reject all compare requests."),



  /**
   * Entry ''{0}'' targeted by the compare request does not exist in the server.
   */
  ERR_MEM_HANDLER_COMPARE_NO_SUCH_ENTRY("Entry ''{0}'' targeted by the compare request does not exist in the server."),



  /**
   * The server has been configured to only allow compare operations for authenticated clients.
   */
  ERR_MEM_HANDLER_COMPARE_REQUIRES_AUTH("The server has been configured to only allow compare operations for authenticated clients."),



  /**
   * Unable to delete changelog entry ''{0}''.
   */
  ERR_MEM_HANDLER_DELETE_CHANGELOG("Unable to delete changelog entry ''{0}''."),



  /**
   * Unable to delete entry ''{0}'' because it has one or more subordinate entries.
   */
  ERR_MEM_HANDLER_DELETE_HAS_SUBORDINATES("Unable to delete entry ''{0}'' because it has one or more subordinate entries."),



  /**
   * Unable to delete entry ''{0}'' because an error occurred while attempting to parse the DN:  {1}
   */
  ERR_MEM_HANDLER_DELETE_MALFORMED_DN("Unable to delete entry ''{0}'' because an error occurred while attempting to parse the DN:  {1}"),



  /**
   * The server has been configured to reject all delete requests.
   */
  ERR_MEM_HANDLER_DELETE_NOT_ALLOWED("The server has been configured to reject all delete requests."),



  /**
   * Unable to delete entry ''{0}'' because it does not exist in the server.
   */
  ERR_MEM_HANDLER_DELETE_NO_SUCH_ENTRY("Unable to delete entry ''{0}'' because it does not exist in the server."),



  /**
   * The server has been configured to only allow delete operations for authenticated clients.
   */
  ERR_MEM_HANDLER_DELETE_REQUIRES_AUTH("The server has been configured to only allow delete operations for authenticated clients."),



  /**
   * Unable to delete the server root DSE.
   */
  ERR_MEM_HANDLER_DELETE_ROOT_DSE("Unable to delete the server root DSE."),



  /**
   * Unable to delete the subschema subentry ''{0}''.
   */
  ERR_MEM_HANDLER_DELETE_SCHEMA("Unable to delete the subschema subentry ''{0}''."),



  /**
   * The server has been configured to reject all extended requests.
   */
  ERR_MEM_HANDLER_EXTENDED_NOT_ALLOWED("The server has been configured to reject all extended requests."),



  /**
   * An unexpected error occurred while attempting to process the requested extended operation:  {0}
   */
  ERR_MEM_HANDLER_EXTENDED_OP_FAILURE("An unexpected error occurred while attempting to process the requested extended operation:  {0}"),



  /**
   * No extended operation handler is defined for extended request OID ''{0}''.
   */
  ERR_MEM_HANDLER_EXTENDED_OP_NOT_SUPPORTED("No extended operation handler is defined for extended request OID ''{0}''."),



  /**
   * The provided configuration contains multiple extended operation handlers that claim to support operations with request OID ''{0}''.
   */
  ERR_MEM_HANDLER_EXTENDED_REQUEST_HANDLER_CONFLICT("The provided configuration contains multiple extended operation handlers that claim to support operations with request OID ''{0}''."),



  /**
   * The server has been configured to only allow extended operations for authenticated clients.
   */
  ERR_MEM_HANDLER_EXTENDED_REQUIRES_AUTH("The server has been configured to only allow extended operations for authenticated clients."),



  /**
   * An error occurred while attempting to read an entry from LDIF:  {0}
   */
  ERR_MEM_HANDLER_INIT_FROM_LDIF_READ_ERROR("An error occurred while attempting to read an entry from LDIF:  {0}"),



  /**
   * An error occurred while attempting to close the LDIF writer:  {0}
   */
  ERR_MEM_HANDLER_LDIF_WRITE_CLOSE_ERROR("An error occurred while attempting to close the LDIF writer:  {0}"),



  /**
   * An error occurred while attempting to write entry ''{0}'' to LDIF:  {1}
   */
  ERR_MEM_HANDLER_LDIF_WRITE_ERROR("An error occurred while attempting to write entry ''{0}'' to LDIF:  {1}"),



  /**
   * The simple paged results control value included cookie with an unsupported value format.
   */
  ERR_MEM_HANDLER_MALFORMED_PAGED_RESULTS_COOKIE("The simple paged results control value included cookie with an unsupported value format."),



  /**
   * The server has been configured to reject all modify DN requests.
   */
  ERR_MEM_HANDLER_MODIFY_DN_NOT_ALLOWED("The server has been configured to reject all modify DN requests."),



  /**
   * The server has been configured to only allow modify DN operations for authenticated clients.
   */
  ERR_MEM_HANDLER_MODIFY_DN_REQUIRES_AUTH("The server has been configured to only allow modify DN operations for authenticated clients."),



  /**
   * The server has been configured to reject all modify requests.
   */
  ERR_MEM_HANDLER_MODIFY_NOT_ALLOWED("The server has been configured to reject all modify requests."),



  /**
   * The server has been configured to only allow modify operations for authenticated clients.
   */
  ERR_MEM_HANDLER_MODIFY_REQUIRES_AUTH("The server has been configured to only allow modify operations for authenticated clients."),



  /**
   * Unable to modify changelog entry ''{0}''.
   */
  ERR_MEM_HANDLER_MOD_CHANGELOG("Unable to modify changelog entry ''{0}''."),



  /**
   * Unable to modify the DN of entry ''{0}'' because an error occurred while attempting to parse the DN:  {1}
   */
  ERR_MEM_HANDLER_MOD_DN_MALFORMED_DN("Unable to modify the DN of entry ''{0}'' because an error occurred while attempting to parse the DN:  {1}"),



  /**
   * Unable to modify the DN of entry ''{0}'' because an error occurred while attempting to parse new RDN ''{1}'':  {2}
   */
  ERR_MEM_HANDLER_MOD_DN_MALFORMED_NEW_RDN("Unable to modify the DN of entry ''{0}'' because an error occurred while attempting to parse new RDN ''{1}'':  {2}"),



  /**
   * Unable to modify the DN of entry ''{0}'' because an error occurred while attempting to parse the new superior DN ''{1}'':  {2}
   */
  ERR_MEM_HANDLER_MOD_DN_MALFORMED_NEW_SUPERIOR("Unable to modify the DN of entry ''{0}'' because an error occurred while attempting to parse the new superior DN ''{1}'':  {2}"),



  /**
   * Unable to modify the DN of entry ''{0}'' because a smart referral entry ''{1}'' was encountered in the path of the constructed new DN ''{2}''.
   */
  ERR_MEM_HANDLER_MOD_DN_NEW_DN_BELOW_REFERRAL("Unable to modify the DN of entry ''{0}'' because a smart referral entry ''{1}'' was encountered in the path of the constructed new DN ''{2}''."),



  /**
   * Unable to modify the DN of entry ''{0}'' because the new DN is the same as the current DN.
   */
  ERR_MEM_HANDLER_MOD_DN_NEW_DN_SAME_AS_OLD("Unable to modify the DN of entry ''{0}'' because the new DN is the same as the current DN."),



  /**
   * Unable to modify the DN of entry ''{0}'' because that entry does not exist in the server.
   */
  ERR_MEM_HANDLER_MOD_DN_NO_SUCH_ENTRY("Unable to modify the DN of entry ''{0}'' because that entry does not exist in the server."),



  /**
   * Unable to modify the DN of entry ''{0}'' because it would alter the value of attribute {1} which is declared with NO-USER-MODIFICATION in the schema.
   */
  ERR_MEM_HANDLER_MOD_DN_NO_USER_MOD("Unable to modify the DN of entry ''{0}'' because it would alter the value of attribute {1} which is declared with NO-USER-MODIFICATION in the schema."),



  /**
   * Unable to modify the DN of entry ''{0}'' because the parent for the new DN ''{1}'' does not exist.
   */
  ERR_MEM_HANDLER_MOD_DN_PARENT_DOESNT_EXIST("Unable to modify the DN of entry ''{0}'' because the parent for the new DN ''{1}'' does not exist."),



  /**
   * Modify DN operations are not allowed for the server root DSE.
   */
  ERR_MEM_HANDLER_MOD_DN_ROOT_DSE("Modify DN operations are not allowed for the server root DSE."),



  /**
   * Modify DN operations are not allowed for changelog entries.
   */
  ERR_MEM_HANDLER_MOD_DN_SOURCE_IS_CHANGELOG("Modify DN operations are not allowed for changelog entries."),



  /**
   * Modify DN operations are not allowed for the subschema subentry.
   */
  ERR_MEM_HANDLER_MOD_DN_SOURCE_IS_SCHEMA("Modify DN operations are not allowed for the subschema subentry."),



  /**
   * Unable to modify the DN of entry ''{0}'' because another entry with DN ''{1}'' already exists in the server.
   */
  ERR_MEM_HANDLER_MOD_DN_TARGET_ALREADY_EXISTS("Unable to modify the DN of entry ''{0}'' because another entry with DN ''{1}'' already exists in the server."),



  /**
   * Unable to modify the DN of entry ''{0}'' because the new DN ''{1}'' is at or below the changelog base entry.
   */
  ERR_MEM_HANDLER_MOD_DN_TARGET_IS_CHANGELOG("Unable to modify the DN of entry ''{0}'' because the new DN ''{1}'' is at or below the changelog base entry."),



  /**
   * Unable to modify the DN of entry ''{0}'' because new DN ''{1}'' is already in use for the subschema subentry.
   */
  ERR_MEM_HANDLER_MOD_DN_TARGET_IS_SCHEMA("Unable to modify the DN of entry ''{0}'' because new DN ''{1}'' is already in use for the subschema subentry."),



  /**
   * Unable to modify the DN of entry ''{0}'' because the updated entry would have violated the provided schema:  {1}
   */
  ERR_MEM_HANDLER_MOD_DN_VIOLATES_SCHEMA("Unable to modify the DN of entry ''{0}'' because the updated entry would have violated the provided schema:  {1}"),



  /**
   * Unable to modify entry ''{0}'' because an error occurred while attempting to apply the requested modifications:  {1}
   */
  ERR_MEM_HANDLER_MOD_FAILED("Unable to modify entry ''{0}'' because an error occurred while attempting to apply the requested modifications:  {1}"),



  /**
   * Unable to modify entry ''{0}'' because an error occurred while attempting to parse the target DN:  {1}
   */
  ERR_MEM_HANDLER_MOD_MALFORMED_DN("Unable to modify entry ''{0}'' because an error occurred while attempting to parse the target DN:  {1}"),



  /**
   * Unable to modify entry ''{0}'' because it does not exist in the server.
   */
  ERR_MEM_HANDLER_MOD_NO_SUCH_ENTRY("Unable to modify entry ''{0}'' because it does not exist in the server."),



  /**
   * Unable to modify entry ''{0}'' because one of the modifications targeted attribute {1} which is declared with NO-USER-MODIFICATION in the schema.
   */
  ERR_MEM_HANDLER_MOD_NO_USER_MOD("Unable to modify entry ''{0}'' because one of the modifications targeted attribute {1} which is declared with NO-USER-MODIFICATION in the schema."),



  /**
   * Unable to modify the server root DSE.
   */
  ERR_MEM_HANDLER_MOD_ROOT_DSE("Unable to modify the server root DSE."),



  /**
   * Unable to modify the subschema subentry ''{0}''.
   */
  ERR_MEM_HANDLER_MOD_SCHEMA("Unable to modify the subschema subentry ''{0}''."),



  /**
   * Schema modifications to attribute ''{0}'' are not allowed.
   */
  ERR_MEM_HANDLER_MOD_SCHEMA_DISALLOWED_ATTR("Schema modifications to attribute ''{0}'' are not allowed."),



  /**
   * Schema ''{0}'' modifications are not allowed for attribute ''{1}''.
   */
  ERR_MEM_HANDLER_MOD_SCHEMA_DISALLOWED_MOD_TYPE("Schema ''{0}'' modifications are not allowed for attribute ''{1}''."),



  /**
   * Unable to modify entry ''{0}'' because the entry resulting from applying the modifications would have violated the provided schema:  {1}
   */
  ERR_MEM_HANDLER_MOD_VIOLATES_SCHEMA("Unable to modify entry ''{0}'' because the entry resulting from applying the modifications would have violated the provided schema:  {1}"),



  /**
   * Unable to create an in-memory request handler with no base DNs.
   */
  ERR_MEM_HANDLER_NO_BASE_DNS("Unable to create an in-memory request handler with no base DNs."),



  /**
   * The requested identity ''{0}'' could not be mapped to a user defined in the server.
   */
  ERR_MEM_HANDLER_NO_SUCH_IDENTITY("The requested identity ''{0}'' could not be mapped to a user defined in the server."),



  /**
   * Unable to use the null DN as a base DN for the in-memory request handler.
   */
  ERR_MEM_HANDLER_NULL_BASE_DN("Unable to use the null DN as a base DN for the in-memory request handler."),



  /**
   * An unexpected error occurred while attempting to process the requested SASL bind operation:  {0}
   */
  ERR_MEM_HANDLER_SASL_BIND_FAILURE("An unexpected error occurred while attempting to process the requested SASL bind operation:  {0}"),



  /**
   * The provided configuration contains multiple SASL bind handlers that claim to support the ''{0}'' SASL mechanism.
   */
  ERR_MEM_HANDLER_SASL_BIND_HANDLER_CONFLICT("The provided configuration contains multiple SASL bind handlers that claim to support the ''{0}'' SASL mechanism."),



  /**
   * SASL mechanism ''{0}'' is not supported by any of the configured SASL bind handlers.
   */
  ERR_MEM_HANDLER_SASL_MECH_NOT_SUPPORTED("SASL mechanism ''{0}'' is not supported by any of the configured SASL bind handlers."),



  /**
   * Unable to use a DN at or below the subschema subentry DN ''{0}'' as a base DN for the in-memory request handler.
   */
  ERR_MEM_HANDLER_SCHEMA_BASE_DN("Unable to use a DN at or below the subschema subentry DN ''{0}'' as a base DN for the in-memory request handler."),



  /**
   * Unable to perform the search because base entry ''{0}'' does not exist in the server.
   */
  ERR_MEM_HANDLER_SEARCH_BASE_DOES_NOT_EXIST("Unable to perform the search because base entry ''{0}'' does not exist in the server."),



  /**
   * Unable to perform the search because an error occurred while attempting to parse base DN ''{0}'':  {1}
   */
  ERR_MEM_HANDLER_SEARCH_MALFORMED_BASE("Unable to perform the search because an error occurred while attempting to parse base DN ''{0}'':  {1}"),



  /**
   * The server has been configured to reject all search requests.
   */
  ERR_MEM_HANDLER_SEARCH_NOT_ALLOWED("The server has been configured to reject all search requests."),



  /**
   * The server has been configured to only allow search operations for authenticated clients.
   */
  ERR_MEM_HANDLER_SEARCH_REQUIRES_AUTH("The server has been configured to only allow search operations for authenticated clients."),



  /**
   * The search size limit has been exceeded.
   */
  ERR_MEM_HANDLER_SEARCH_SIZE_LIMIT_EXCEEDED("The search size limit has been exceeded."),



  /**
   * Entry ''{0}'' was found to contain attribute ''{1}'' when that attribute was expected to be missing.
   */
  ERR_MEM_HANDLER_TEST_ATTR_EXISTS("Entry ''{0}'' was found to contain attribute ''{1}'' when that attribute was expected to be missing."),



  /**
   * Entry ''{0}'' exists but does not have any values for attribute ''{1}''.
   */
  ERR_MEM_HANDLER_TEST_ATTR_MISSING("Entry ''{0}'' exists but does not have any values for attribute ''{1}''."),



  /**
   * Entry ''{0}'' was found to exist in the server but does not match expected filter ''{1}''.
   */
  ERR_MEM_HANDLER_TEST_ENTRY_DOES_NOT_MATCH_FILTER("Entry ''{0}'' was found to exist in the server but does not match expected filter ''{1}''."),



  /**
   * Entry ''{0}'' was found in the server but was expected to be missing.
   */
  ERR_MEM_HANDLER_TEST_ENTRY_EXISTS("Entry ''{0}'' was found in the server but was expected to be missing."),



  /**
   * Entry ''{0}'' does not exist in the server.
   */
  ERR_MEM_HANDLER_TEST_ENTRY_MISSING("Entry ''{0}'' does not exist in the server."),



  /**
   * Entry ''{0}'' was found to contain attribute ''{1}'' with value ''{2}'' when that value was expected to be missing.
   */
  ERR_MEM_HANDLER_TEST_VALUE_EXISTS("Entry ''{0}'' was found to contain attribute ''{1}'' with value ''{2}'' when that value was expected to be missing."),



  /**
   * Entry ''{0}'' exists and contains attribute ''{1}'', but that attribute does not include value ''{2}''.
   */
  ERR_MEM_HANDLER_TEST_VALUE_MISSING("Entry ''{0}'' exists and contains attribute ''{1}'', but that attribute does not include value ''{2}''."),



  /**
   * The search request time limit expired while interjecting the processing delay.
   */
  ERR_MEM_HANDLER_TIME_LIMIT_EXCEEDED("The search request time limit expired while interjecting the processing delay."),



  /**
   * Transaction {0} has been aborted because the client sent a request with a transaction specification request control containing non-matching transaction ID {1}.  No changes associated with transaction {0} have been processed.
   */
  ERR_MEM_HANDLER_TXN_ABORTED_BY_CONTROL_TXN_ID_MISMATCH("Transaction {0} has been aborted because the client sent a request with a transaction specification request control containing non-matching transaction ID {1}.  No changes associated with transaction {0} have been processed."),



  /**
   * The request included a transaction specification request control with transaction ID {0}, but the active transaction for the connection had a transaction ID of {1}.  Transaction {1} has been aborted, and no changes associated with that transaction have been processed.
   */
  ERR_MEM_HANDLER_TXN_CONTROL_ID_MISMATCH("The request included a transaction specification request control with transaction ID {0}, but the active transaction for the connection had a transaction ID of {1}.  Transaction {1} has been aborted, and no changes associated with that transaction have been processed."),



  /**
   * The request included a transaction specification control for transaction {0}, but no transaction is currently in progress for this client connection.
   */
  ERR_MEM_HANDLER_TXN_CONTROL_WITHOUT_TXN("The request included a transaction specification control for transaction {0}, but no transaction is currently in progress for this client connection."),



  /**
   * The SASL bind request cannot be processed because the credentials are not properly formatted for the SASL PLAIN mechanism.
   */
  ERR_PLAIN_BIND_MALFORMED_CREDENTIALS("The SASL bind request cannot be processed because the credentials are not properly formatted for the SASL PLAIN mechanism."),



  /**
   * The SASL PLAIN bind request cannot be processed because it does not include any SASL credentials.
   */
  ERR_PLAIN_BIND_NO_CREDENTIALS("The SASL PLAIN bind request cannot be processed because it does not include any SASL credentials."),



  /**
   * The proxy request handler does not support SASL authentication.  Only simple authentication may be used.
   */
  ERR_PROXY_HANDLER_SASL_NOT_SUPPORTED("The proxy request handler does not support SASL authentication.  Only simple authentication may be used."),



  /**
   * Refusing to encode an empty password.
   */
  ERR_PW_ENCODER_ENCODE_PASSWORD_EMPTY("Refusing to encode an empty password."),



  /**
   * Unable to use the in-memory directory server password encoder defined in class {0} to verify a clear-text password against an encoded password because the provided encoded password does not start with the expected prefix of ''{1}''.
   */
  ERR_PW_ENCODER_PW_MATCHES_ENCODED_PW_MISSING_PREFIX("Unable to use the in-memory directory server password encoder defined in class {0} to verify a clear-text password against an encoded password because the provided encoded password does not start with the expected prefix of ''{1}''."),



  /**
   * Unable to use the in-memory directory server password encoder defined in class {0} to validate a pre-encoded password because the provided encoded password does not start with the expected prefix of ''{1}''.
   */
  ERR_PW_ENCODER_VALIDATE_ENCODED_PW_MISSING_PREFIX("Unable to use the in-memory directory server password encoder defined in class {0} to validate a pre-encoded password because the provided encoded password does not start with the expected prefix of ''{1}''."),



  /**
   * An error occurred while attempting to change the password for user ''{0}'':  {1}
   */
  ERR_PW_MOD_EXTOP_CANNOT_CHANGE_PW("An error occurred while attempting to change the password for user ''{0}'':  {1}"),



  /**
   * The password modify extended operation cannot be used to change the password for user ''{0}'' because it was unable to retrieve the DN for that user and cannot be used to change the password for users defined in the set of additional bind credentials.
   */
  ERR_PW_MOD_EXTOP_CANNOT_GET_USER_ENTRY("The password modify extended operation cannot be used to change the password for user ''{0}'' because it was unable to retrieve the DN for that user and cannot be used to change the password for users defined in the set of additional bind credentials."),



  /**
   * Unable to parse the user identity string ''{0}'' from the password modify extended request as either a DN or an authorization ID.
   */
  ERR_PW_MOD_EXTOP_CANNOT_PARSE_USER_IDENTITY("Unable to parse the user identity string ''{0}'' from the password modify extended request as either a DN or an authorization ID."),



  /**
   * The password modify extended operation requires that either an old password be provided in the request or that the client connection be authenticated.
   */
  ERR_PW_MOD_EXTOP_NO_AUTHENTICATION("The password modify extended operation requires that either an old password be provided in the request or that the client connection be authenticated."),



  /**
   * The password modify extended operation cannot be processed because the server is not configured with any password attributes.
   */
  ERR_PW_MOD_EXTOP_NO_PW_ATTRS("The password modify extended operation cannot be processed because the server is not configured with any password attributes."),



  /**
   * The password modify extended operation handler does not support critical control with OID ''{0}''.
   */
  ERR_PW_MOD_EXTOP_UNSUPPORTED_CONTROL("The password modify extended operation handler does not support critical control with OID ''{0}''."),



  /**
   * Unable to process the password modify extended operation because the client is unauthenticated and no target user identity was included in the request.
   */
  ERR_PW_MOD_NO_IDENTITY("Unable to process the password modify extended operation because the client is unauthenticated and no target user identity was included in the request."),



  /**
   * Passwords encoded using a message digest are not reversible.
   */
  ERR_SALTED_DIGEST_PW_ENCODER_NOT_REVERSIBLE("Passwords encoded using a message digest are not reversible."),



  /**
   * The provided pre-encoded password cannot be a valid representation of a salted ''{0}'' digest because the pre-encoded password had a length of {1,number,0} bytes, but the length was expected to be at least {2,number,0} bytes.
   */
  ERR_SALTED_DIGEST_PW_ENCODER_PRE_ENCODED_LENGTH_MISMATCH("The provided pre-encoded password cannot be a valid representation of a salted ''{0}'' digest because the pre-encoded password had a length of {1,number,0} bytes, but the length was expected to be at least {2,number,0} bytes."),



  /**
   * An error occurred while attempting to send a clear-text response to the StartTLS request:  {0}
   */
  ERR_START_TLS_REQUEST_HANDLER_WRITE_RESPONSE_FAILURE("An error occurred while attempting to send a clear-text response to the StartTLS request:  {0}"),



  /**
   * Existing transaction {0} has been aborted because the client sent a malformed end transaction request.  No changes have been made as part of transaction {0}.
   */
  ERR_TXN_EXTOP_ABORTED_BY_MALFORMED_END_TXN("Existing transaction {0} has been aborted because the client sent a malformed end transaction request.  No changes have been made as part of transaction {0}."),



  /**
   * Active transaction {0} has been aborted because the client sent a transaction request with critical control ''{1}'' that is not supported for use with transactions.  No changes have been made as part of transaction {0}.
   */
  ERR_TXN_EXTOP_ABORTED_BY_UNSUPPORTED_CONTROL("Active transaction {0} has been aborted because the client sent a transaction request with critical control ''{1}'' that is not supported for use with transactions.  No changes have been made as part of transaction {0}."),



  /**
   * Existing transaction {0} has been aborted because the client attempted to incorrectly end nonexistent transaction {1}.  No changes have been made as part of transaction {0}.
   */
  ERR_TXN_EXTOP_ABORTED_BY_WRONG_END_TXN("Existing transaction {0} has been aborted because the client attempted to incorrectly end nonexistent transaction {1}.  No changes have been made as part of transaction {0}."),



  /**
   * Unable to commit transaction {0} because an error occurred while attempting to process {1} request with message ID {2} as part of the transaction:  {3}  No changes have been made as part of the transaction.
   */
  ERR_TXN_EXTOP_COMMIT_FAILED("Unable to commit transaction {0} because an error occurred while attempting to process {1} request with message ID {2} as part of the transaction:  {3}  No changes have been made as part of the transaction."),



  /**
   * There is no active transaction on this client connection.
   */
  ERR_TXN_EXTOP_END_NO_ACTIVE_TXN("There is no active transaction on this client connection."),



  /**
   * The end transaction request attempted to target transaction ID {0} but the transaction ID for the active operation on this client connection is {1}.  The existing transaction has been aborted.
   */
  ERR_TXN_EXTOP_END_WRONG_TXN("The end transaction request attempted to target transaction ID {0} but the transaction ID for the active operation on this client connection is {1}.  The existing transaction has been aborted."),



  /**
   * Existing transaction {0} has been aborted because the client has initiated a new start transaction request.  No changes have been made as part of transaction {0}.
   */
  ERR_TXN_EXTOP_TXN_ABORTED_BY_NEW_START_TXN("Existing transaction {0} has been aborted because the client has initiated a new start transaction request.  No changes have been made as part of transaction {0}."),



  /**
   * The transaction extended operation handler does not support critical control with OID ''{0}''.
   */
  ERR_TXN_EXTOP_UNSUPPORTED_CONTROL("The transaction extended operation handler does not support critical control with OID ''{0}''."),



  /**
   * Passwords encoded using a message digest are not reversible.
   */
  ERR_UNSALTED_DIGEST_PW_ENCODER_NOT_REVERSIBLE("Passwords encoded using a message digest are not reversible."),



  /**
   * The provided pre-encoded password cannot be a valid representation of an unsalted ''{0}'' digest because the pre-encoded password had a length of {1,number,0} bytes, but the length was expected to be {2,number,0} bytes.
   */
  ERR_UNSALTED_DIGEST_PW_ENCODER_PRE_ENCODED_LENGTH_MISMATCH("The provided pre-encoded password cannot be a valid representation of an unsalted ''{0}'' digest because the pre-encoded password had a length of {1,number,0} bytes, but the length was expected to be {2,number,0} bytes."),



  /**
   * The "Who Am I?" extended operation handler does not support critical control with OID ''{0}''.
   */
  ERR_WHO_AM_I_EXTOP_UNSUPPORTED_CONTROL("The \"Who Am I?\" extended operation handler does not support critical control with OID ''{0}''."),



  /**
   * Added {0,number,0} entries from LDIF file {1}
   */
  INFO_MEM_DS_TOOL_ADDED_ENTRIES_FROM_LDIF("Added {0,number,0} entries from LDIF file {1}"),



  /**
   * The path to a file to which access log information should be written about operations processed by the server.  This cannot be used in conjunction with the ''--accessLogToStandardOut'' argument.  If neither argument is provided, then no access logging will be performed.
   */
  INFO_MEM_DS_TOOL_ARG_DESC_ACCESS_LOG_FILE("The path to a file to which access log information should be written about operations processed by the server.  This cannot be used in conjunction with the ''--accessLogToStandardOut'' argument.  If neither argument is provided, then no access logging will be performed."),



  /**
   * Indicates that access log information should be written to standard output.  This cannot be used in conjunction with the ''--accessLogFile'' argument.  If neither argument is provided, then no access logging will be performed.
   */
  INFO_MEM_DS_TOOL_ARG_DESC_ACCESS_LOG_TO_STDOUT("Indicates that access log information should be written to standard output.  This cannot be used in conjunction with the ''--accessLogFile'' argument.  If neither argument is provided, then no access logging will be performed."),



  /**
   * An additional DN that may be used to bind to the server even if the specified user does not exist in the data set.  If this is provided, then the "--additionalBindPassword" argument must also be given.
   */
  INFO_MEM_DS_TOOL_ARG_DESC_ADDITIONAL_BIND_DN("An additional DN that may be used to bind to the server even if the specified user does not exist in the data set.  If this is provided, then the \"--additionalBindPassword\" argument must also be given."),



  /**
   * The password that should be used to authenticate when using the DN specified with the "--additionalBindDN" argument.
   */
  INFO_MEM_DS_TOOL_ARG_DESC_ADDITIONAL_BIND_PW("The password that should be used to authenticate when using the DN specified with the \"--additionalBindDN\" argument."),



  /**
   * The base DN to use for the server.  Only entries at or below one of the defined base DNs may be created in the server.  At least one base DN must be defined, but multiple base DNs may be specified as separate arguments.
   */
  INFO_MEM_DS_TOOL_ARG_DESC_BASE_DN("The base DN to use for the server.  Only entries at or below one of the defined base DNs may be created in the server.  At least one base DN must be defined, but multiple base DNs may be specified as separate arguments."),



  /**
   * The path to a file to which the server should write generated code that may be used to recreate the requests received from clients.  If this argument is not provided, then no code logging will be performed.
   */
  INFO_MEM_DS_TOOL_ARG_DESC_CODE_LOG_FILE("The path to a file to which the server should write generated code that may be used to recreate the requests received from clients.  If this argument is not provided, then no code logging will be performed."),



  /**
   * Indicates that the server should not be started.  This is only intended for internal testing purposes, since a command-line server that can't be started isn't very useful.
   */
  INFO_MEM_DS_TOOL_ARG_DESC_DONT_START("Indicates that the server should not be started.  This is only intended for internal testing purposes, since a command-line server that can't be started isn't very useful."),



  /**
   * Maintain an equality index for the specified attribute.  The server must be configured to use a schema (which may optionally be the default standard schema), and the specified attribute type must be defined in the schema.
   */
  INFO_MEM_DS_TOOL_ARG_DESC_EQ_INDEX("Maintain an equality index for the specified attribute.  The server must be configured to use a schema (which may optionally be the default standard schema), and the specified attribute type must be defined in the schema."),



  /**
   * The path to the Java key store file that will be used to obtain the certificate to use for SSL communication.  This may only be provided if either the "--useSSL" or "--useStartTLS" argument is also given.
   */
  INFO_MEM_DS_TOOL_ARG_DESC_KEY_STORE_PATH("The path to the Java key store file that will be used to obtain the certificate to use for SSL communication.  This may only be provided if either the \"--useSSL\" or \"--useStartTLS\" argument is also given."),



  /**
   * The password to use to access the contents of the SSL key store.  This may only be provided if either the "--useSSL" or "--useStartTLS" argument is also given.
   */
  INFO_MEM_DS_TOOL_ARG_DESC_KEY_STORE_PW("The password to use to access the contents of the SSL key store.  This may only be provided if either the \"--useSSL\" or \"--useStartTLS\" argument is also given."),



  /**
   * The path to a file to which detailed information should be written about the LDAP communication performed by the server.  This cannot be  used in conjunction with the ''--ldapDebugLogToStandardOut'' argument.  If neither argument is provided, then no LDAP debug logging will be performed.
   */
  INFO_MEM_DS_TOOL_ARG_DESC_LDAP_DEBUG_LOG_FILE("The path to a file to which detailed information should be written about the LDAP communication performed by the server.  This cannot be  used in conjunction with the ''--ldapDebugLogToStandardOut'' argument.  If neither argument is provided, then no LDAP debug logging will be performed."),



  /**
   * Indicates that LDAP debug log information should be written to standard output.  This cannot be used in conjunction with the ''--ldapDebugLogFile'' argument.  If neither argument is provided, then no LDAP debug logging will be performed.
   */
  INFO_MEM_DS_TOOL_ARG_DESC_LDAP_DEBUG_LOG_TO_STDOUT("Indicates that LDAP debug log information should be written to standard output.  This cannot be used in conjunction with the ''--ldapDebugLogFile'' argument.  If neither argument is provided, then no LDAP debug logging will be performed."),



  /**
   * The path to an LDIF file containing an initial set of data to use to populate the server.  If this is not provided, then the server will initially be empty.
   */
  INFO_MEM_DS_TOOL_ARG_DESC_LDIF_FILE("The path to an LDIF file containing an initial set of data to use to populate the server.  If this is not provided, then the server will initially be empty."),



  /**
   * The maximum number of LDAP changelog entries that should be maintained by the server.  If this is not provided, then the server will not maintain a changelog.
   */
  INFO_MEM_DS_TOOL_ARG_DESC_MAX_CHANGELOG_ENTRIES("The maximum number of LDAP changelog entries that should be maintained by the server.  If this is not provided, then the server will not maintain a changelog."),



  /**
   * The port on which the server should listen for client requests.  If a value is specified, then it must be an integer between 1 and 65535.  If no port is specified, then the server will automatically select a free port to use.
   */
  INFO_MEM_DS_TOOL_ARG_DESC_PORT("The port on which the server should listen for client requests.  If a value is specified, then it must be an integer between 1 and 65535.  If no port is specified, then the server will automatically select a free port to use."),



  /**
   * The path to the Java trust store file that will be used to determine whether to trust any client certificates presented to the server.  This may only be provided if either the "--useSSL" or "--useStartTLS" argument is given, but if SSL or StartTLS is to be used and no trust store path is specified, then the server will automatically trust any client certificate presented to it.
   */
  INFO_MEM_DS_TOOL_ARG_DESC_TRUST_STORE_PATH("The path to the Java trust store file that will be used to determine whether to trust any client certificates presented to the server.  This may only be provided if either the \"--useSSL\" or \"--useStartTLS\" argument is given, but if SSL or StartTLS is to be used and no trust store path is specified, then the server will automatically trust any client certificate presented to it."),



  /**
   * The password to use to access the contents of the SSL trust store.  This may only be provided if the "--trustStorePath" argument is also given.  If a trust store path is specified but no trust store password is given, then the server will attempt to access the trust store contents without a password.
   */
  INFO_MEM_DS_TOOL_ARG_DESC_TRUST_STORE_PW("The password to use to access the contents of the SSL trust store.  This may only be provided if the \"--trustStorePath\" argument is also given.  If a trust store path is specified but no trust store password is given, then the server will attempt to access the trust store contents without a password."),



  /**
   * Indicates that the server should use a default set of standard schema.
   */
  INFO_MEM_DS_TOOL_ARG_DESC_USE_DEFAULT_SCHEMA("Indicates that the server should use a default set of standard schema."),



  /**
   * The path to a file or directory containing schema definitions to use for the server.  If the path specified is a file, then it must be an LDIF file containing a single entry that is a valid LDAP subschema subentry.  If the path specified is a directory, then any files contained in it will be examined in lexicographic order by name to create an aggregate schema.
   */
  INFO_MEM_DS_TOOL_ARG_DESC_USE_SCHEMA_FILE("The path to a file or directory containing schema definitions to use for the server.  If the path specified is a file, then it must be an LDIF file containing a single entry that is a valid LDAP subschema subentry.  If the path specified is a directory, then any files contained in it will be examined in lexicographic order by name to create an aggregate schema."),



  /**
   * Indicates that the server should encrypt all communication using SSL.  If this argument is provided, then the "--keyStorePath" and "--keyStorePassword" arguments must also be given, and the "--useStartTLS" argument must not be given.
   */
  INFO_MEM_DS_TOOL_ARG_DESC_USE_SSL("Indicates that the server should encrypt all communication using SSL.  If this argument is provided, then the \"--keyStorePath\" and \"--keyStorePassword\" arguments must also be given, and the \"--useStartTLS\" argument must not be given."),



  /**
   * Indicates that the server should support the use of the StartTLS extended operation to encrypt all subsequent communication.  If this argument is provided, then the "--keyStorePath" and "--keyStorePassword" arguments must also be given, and the "--useSSL" argument must not be given.
   */
  INFO_MEM_DS_TOOL_ARG_DESC_USE_START_TLS("Indicates that the server should support the use of the StartTLS extended operation to encrypt all subsequent communication.  If this argument is provided, then the \"--keyStorePath\" and \"--keyStorePassword\" arguments must also be given, and the \"--useSSL\" argument must not be given."),



  /**
   * The value to include in the vendorName argument of the server root DSE.
   */
  INFO_MEM_DS_TOOL_ARG_DESC_VENDOR_NAME("The value to include in the vendorName argument of the server root DSE."),



  /**
   * The value to include in the vendorVersion argument of the server root DSE.
   */
  INFO_MEM_DS_TOOL_ARG_DESC_VENDOR_VERSION("The value to include in the vendorVersion argument of the server root DSE."),



  /**
   * {attr}
   */
  INFO_MEM_DS_TOOL_ARG_PLACEHOLDER_ATTR("{attr}"),



  /**
   * {baseDN}
   */
  INFO_MEM_DS_TOOL_ARG_PLACEHOLDER_BASE_DN("{baseDN}"),



  /**
   * {bindDN}
   */
  INFO_MEM_DS_TOOL_ARG_PLACEHOLDER_BIND_DN("{bindDN}"),



  /**
   * {count}
   */
  INFO_MEM_DS_TOOL_ARG_PLACEHOLDER_COUNT("{count}"),



  /**
   * {password}
   */
  INFO_MEM_DS_TOOL_ARG_PLACEHOLDER_PASSWORD("{password}"),



  /**
   * {path}
   */
  INFO_MEM_DS_TOOL_ARG_PLACEHOLDER_PATH("{path}"),



  /**
   * {port} 
   */
  INFO_MEM_DS_TOOL_ARG_PLACEHOLDER_PORT("{port} "),



  /**
   * {value}
   */
  INFO_MEM_DS_TOOL_ARG_PLACEHOLDER_VALUE("{value}"),



  /**
   * A simple LDAP directory server which holds all of its information in memory and can be used for basic testing purposes.  It can be created and managed programmatically using the {0} class.
   */
  INFO_MEM_DS_TOOL_DESC("A simple LDAP directory server which holds all of its information in memory and can be used for basic testing purposes.  It can be created and managed programmatically using the {0} class."),



  /**
   * Creates an initially-empty directory server instance listening on an automatically-selected port that will allow entries below 'dc=example,dc=com' and will not perform any logging or schema validation.
   */
  INFO_MEM_DS_TOOL_EXAMPLE_1("Creates an initially-empty directory server instance listening on an automatically-selected port that will allow entries below 'dc=example,dc=com' and will not perform any logging or schema validation."),



  /**
   * Creates a directory server instance listening on port 1389 that is initially populated with the data from the file test.ldif and will allow only entries below 'dc=example,dc=com'.  It will write a record of operations processed to file access.log and will use a default set of standard schema definitions.
   */
  INFO_MEM_DS_TOOL_EXAMPLE_2("Creates a directory server instance listening on port 1389 that is initially populated with the data from the file test.ldif and will allow only entries below 'dc=example,dc=com'.  It will write a record of operations processed to file access.log and will use a default set of standard schema definitions."),



  /**
   * Connectivity Arguments
   */
  INFO_MEM_DS_TOOL_GROUP_CONNECTIVITY("Connectivity Arguments"),



  /**
   * Data Arguments
   */
  INFO_MEM_DS_TOOL_GROUP_DATA("Data Arguments"),



  /**
   * Logging Arguments
   */
  INFO_MEM_DS_TOOL_GROUP_LOGGING("Logging Arguments"),



  /**
   * Listening for client connections on port {0,number,0}.
   */
  INFO_MEM_DS_TOOL_LISTENING("Listening for client connections on port {0,number,0}."),



  /**
   * This operation will be processed as part of transaction {0}.  No changes will be made unless that transaction is successfully committed.
   */
  INFO_MEM_HANDLER_OP_IN_TXN("This operation will be processed as part of transaction {0}.  No changes will be made unless that transaction is successfully committed."),



  /**
   * A smart referral was encountered during processing.  The request may need to be issued elsewhere in order to succeed.
   */
  INFO_MEM_HANDLER_REFERRAL_ENCOUNTERED("A smart referral was encountered during processing.  The request may need to be issued elsewhere in order to succeed."),



  /**
   * Successfully committed transaction {0}.
   */
  INFO_TXN_EXTOP_COMMITTED("Successfully committed transaction {0}."),



  /**
   * Successfully created transaction {0}.
   */
  INFO_TXN_EXTOP_CREATED_TXN("Successfully created transaction {0}."),



  /**
   * Transaction {0} has been successfully aborted.
   */
  INFO_TXN_EXTOP_END_TXN_ABORTED("Transaction {0} has been successfully aborted."),



  /**
   * add
   */
  INFO_TXN_EXTOP_OP_TYPE_ADD("add"),



  /**
   * delete
   */
  INFO_TXN_EXTOP_OP_TYPE_DELETE("delete"),



  /**
   * modify
   */
  INFO_TXN_EXTOP_OP_TYPE_MODIFY("modify"),



  /**
   * modify DN
   */
  INFO_TXN_EXTOP_OP_TYPE_MODIFY_DN("modify DN");



  /**
   * Indicates whether the unit tests are currently running.
   */
  private static final boolean IS_WITHIN_UNIT_TESTS =
       Boolean.getBoolean("com.unboundid.ldap.sdk.RunningUnitTests") ||
       Boolean.getBoolean("com.unboundid.directory.server.RunningUnitTests");



  /**
   * The resource bundle that will be used to load the properties file.
   */
  private static final ResourceBundle RESOURCE_BUNDLE;
  static
  {
    ResourceBundle rb = null;
    try
    {
      rb = ResourceBundle.getBundle("unboundid-ldapsdk-listener");
    } catch (final Exception e) {}
    RESOURCE_BUNDLE = rb;
  }



  /**
   * The map that will be used to hold the unformatted message strings, indexed by property name.
   */
  private static final ConcurrentHashMap<ListenerMessages,String> MESSAGE_STRINGS = new ConcurrentHashMap<>(100);



  /**
   * The map that will be used to hold the message format objects, indexed by property name.
   */
  private static final ConcurrentHashMap<ListenerMessages,MessageFormat> MESSAGES = new ConcurrentHashMap<>(100);



  // The default text for this message
  private final String defaultText;



  /**
   * Creates a new message key.
   */
  private ListenerMessages(final String defaultText)
  {
    this.defaultText = defaultText;
  }



  /**
   * Retrieves a localized version of the message.
   * This method should only be used for messages which do not take any arguments.
   *
   * @return  A localized version of the message.
   */
  public String get()
  {
    String s = MESSAGE_STRINGS.get(this);
    if (s == null)
    {
      if (RESOURCE_BUNDLE == null)
      {
        s = defaultText;
      }
      else
      {
        try
        {
          s = RESOURCE_BUNDLE.getString(name());
        }
        catch (final Exception e)
        {
          s = defaultText;
        }
        MESSAGE_STRINGS.putIfAbsent(this, s);
      }
    }

    if (IS_WITHIN_UNIT_TESTS &&
        (s.contains("{0}") || s.contains("{0,number,0}") ||
         s.contains("{1}") || s.contains("{1,number,0}") ||
         s.contains("{2}") || s.contains("{2,number,0}") ||
         s.contains("{3}") || s.contains("{3,number,0}") ||
         s.contains("{4}") || s.contains("{4,number,0}") ||
         s.contains("{5}") || s.contains("{5,number,0}") ||
         s.contains("{6}") || s.contains("{6,number,0}") ||
         s.contains("{7}") || s.contains("{7,number,0}") ||
         s.contains("{8}") || s.contains("{8,number,0}") ||
         s.contains("{9}") || s.contains("{9,number,0}") ||
         s.contains("{10}") ||  s.contains("{10,number,0}")))
    {
         throw new IllegalArgumentException(
              "Message " + getClass().getName() + '.' + name() +
                   " contains an un-replaced token:  " + s);
    }

    return s;
  }



  /**
   * Retrieves a localized version of the message.
   *
   * @param  args  The arguments to use to format the message.
   *
   * @return  A localized version of the message.
   */
  public String get(final Object... args)
  {
    MessageFormat f = MESSAGES.get(this);
    if (f == null)
    {
      if (RESOURCE_BUNDLE == null)
      {
        f = new MessageFormat(defaultText);
      }
      else
      {
        try
        {
          f = new MessageFormat(RESOURCE_BUNDLE.getString(name()));
        }
        catch (final Exception e)
        {
          f = new MessageFormat(defaultText);
        }
      }
      MESSAGES.putIfAbsent(this, f);
    }

    final String formattedMessage;
    synchronized (f)
    {
      formattedMessage = f.format(args);
    }

    if (IS_WITHIN_UNIT_TESTS &&
        (formattedMessage.contains("{0}") ||
         formattedMessage.contains("{0,number,0}") ||
         formattedMessage.contains("{1}") ||
         formattedMessage.contains("{1,number,0}") ||
         formattedMessage.contains("{2}") ||
         formattedMessage.contains("{2,number,0}") ||
         formattedMessage.contains("{3}") ||
         formattedMessage.contains("{3,number,0}") ||
         formattedMessage.contains("{4}") ||
         formattedMessage.contains("{4,number,0}") ||
         formattedMessage.contains("{5}") ||
         formattedMessage.contains("{5,number,0}") ||
         formattedMessage.contains("{6}") ||
         formattedMessage.contains("{6,number,0}") ||
         formattedMessage.contains("{7}") ||
         formattedMessage.contains("{7,number,0}") ||
         formattedMessage.contains("{8}") ||
         formattedMessage.contains("{8,number,0}") ||
         formattedMessage.contains("{9}") ||
         formattedMessage.contains("{9,number,0}") ||
         formattedMessage.contains("{10}") ||
         formattedMessage.contains("{10,number,0}")))
    {
         throw new IllegalArgumentException(
              "Message " + getClass().getName() + '.' + name() +
                   " contains an un-replaced token:  " + formattedMessage);
    }

    return f.format(args);
  }



  /**
   * Retrieves a string representation of this message key.
   *
   * @return  A string representation of this message key.
   */
  @Override()
  public String toString()
  {
    String s = MESSAGE_STRINGS.get(this);
    if (s == null)
    {
      if (RESOURCE_BUNDLE == null)
      {
        s = defaultText;
      }
      else
      {
        try
        {
          s = RESOURCE_BUNDLE.getString(name());
        }
        catch (final Exception e)
        {
          s = defaultText;
        }
        MESSAGE_STRINGS.putIfAbsent(this, s);
      }
    }

    return s;
  }
}

