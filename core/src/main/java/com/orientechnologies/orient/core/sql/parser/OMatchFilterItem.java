/* Generated By:JJTree: Do not edit this line. OMatchFilterItem.java Version 4.3 */
/* JavaCCOptions:MULTI=true,NODE_USES_PARSER=false,VISITOR=true,TRACK_TOKENS=true,NODE_PREFIX=O,NODE_EXTENDS=,NODE_FACTORY=,SUPPORT_CLASS_VISIBILITY_PUBLIC=true */
package com.orientechnologies.orient.core.sql.parser;

public class OMatchFilterItem extends SimpleNode {
  protected OExpression         className;
  protected OExpression         classNames;
  protected OIdentifier         alias;
  protected OWhereClause        filter;
  protected OArrayRangeSelector depth;
  protected OInteger            minDepth;
  protected OInteger            maxDepth;

  public OMatchFilterItem(int id) {
    super(id);
  }

  public OMatchFilterItem(OrientSql p, int id) {
    super(p, id);
  }

  /** Accept the visitor. **/
  public Object jjtAccept(OrientSqlVisitor visitor, Object data) {
    return visitor.visit(this, data);
  }
}
/* JavaCC - OriginalChecksum=74bf4765509f102180cac29f2295031e (do not edit this line) */
