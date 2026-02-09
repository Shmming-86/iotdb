package org.apache.iotdb.db.conf;

/**
 * 审计日志参数名称
 *
 * @author Shmming
 * @date 2026/2/9
 */
public final class AuditLogParameters {
  private AuditLogParameters() {
    // NO-OP
  }

  /** 是否启用审计日志参数名 */
  public static final String AUDIT_LOG_ENABLED = "audit_logger_enabled";

  /** 审计日志存储策略参数名 */
  public static final String AUDIT_LOG_STORAGE = "audit_log_storage";

  /** 审计日志包含的操作参数名 */
  public static final String AUDIT_LOG_OPERATION = "audit_log_operation";

  /** 是否针对原生写数接口开启审计日志参数名 */
  public static final String AUDIT_LOG_ENABLE_FOR_NATIVE_INSERT_API =
      "enable_audit_log_for_native_insert_api";
}
