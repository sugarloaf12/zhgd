/**
 * Autogenerated by RTP (based on Thrift) Compiler (1.10.1)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
package com.zhgd.zxc;

import org.apache.thrift.TException;
import org.apache.thrift.async.AsyncMethodCallback;

import java.util.List;
import java.util.Map;

public class DMIThriftInterfaceServiceAsyncImpl implements DMIThriftInterface.AsyncIface {

  public void DMI_GetAllResId(final String stringType, final String stringTag, final String stringAccess, final AsyncMethodCallback<List<String>> resultHandler) throws TException {
    // TODO your implemention goes here!
  }

  public void DMI_GetDataAttribute(final String stringType, final String stringAccess, final AsyncMethodCallback<List<String>> resultHandler) throws TException {
    // TODO your implemention goes here!
  }

  public void DMI_FilterParam(final String stringType, final List<String> vecTags, final Map<String,List<String>> mpCondition, final String stringQyCondition, final String stringAccess, final AsyncMethodCallback<Map<Integer,Map<String,String>>> resultHandler) throws TException {
    // TODO your implemention goes here!
  }

  public void DMI_FilterParam2(final String stringType, final List<String> vecTags, final Map<String,List<String>> mpCondition, final String stringQyCondition, final String stringAccess, final String stringKeyMacro, final AsyncMethodCallback<Map<String,Map<String,String>>> resultHandler) throws TException {
    // TODO your implemention goes here!
  }

  public void DMI_UpdateData(final String stringType, final Map<String,Map<String,String>> mpTag2Value, final String stringAccess, final AsyncMethodCallback<Integer> resultHandler) throws TException {
    // TODO your implemention goes here!
  }

  public void DMI_DeleteData(final String stringType, final Map<String,List<String>> mpCondition, final String stringAccess, final AsyncMethodCallback<Integer> resultHandler) throws TException {
    // TODO your implemention goes here!
  }

  public void DMI_DeleteData2(final String stringType, final List<String> vcId, final String stringAccess, final String stringKeyMacro, final AsyncMethodCallback<Void> resultHandler) throws TException {
    // TODO your implemention goes here!
  }

  public void DMI_ReceiveCmd(final String stringCmd, final String stringAccess, final AsyncMethodCallback<Integer> resultHandler) throws TException {
    // TODO your implemention goes here!
  }

  public void DMI_TransBegin(final String stringType, final String stringAccess, final AsyncMethodCallback<String> resultHandler) throws TException {
    // TODO your implemention goes here!
  }

  public void DMI_TransCommit(final String stringType, final String stringAccess, final AsyncMethodCallback<Integer> resultHandler) throws TException {
    // TODO your implemention goes here!
  }

  public void DMI_TransRollback(final String stringType, final String stringAccess, final AsyncMethodCallback<Integer> resultHandler) throws TException {
    // TODO your implemention goes here!
  }

}
