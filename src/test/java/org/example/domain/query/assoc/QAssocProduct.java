package org.example.domain.query.assoc;

import org.avaje.ebean.typequery.PJodaDateTime;
import org.avaje.ebean.typequery.PLong;
import org.avaje.ebean.typequery.PMonth;
import org.avaje.ebean.typequery.PString;
import org.avaje.ebean.typequery.PTimestamp;
import org.avaje.ebean.typequery.TQAssocBean;
import org.avaje.ebean.typequery.TypeQueryBean;
import org.example.domain.Product;

@TypeQueryBean
public class QAssocProduct<R> extends TQAssocBean<Product,R> {

  public PLong<R> id;
  public PLong<R> version;
  public PTimestamp<R> whenCreated;
  public PTimestamp<R> whenUpdated;
  public PString<R> sku;
  public PString<R> name;
  public PJodaDateTime<R> jdDateTime;
  public PMonth<R> month;

  public QAssocProduct(String name, R root) {
    super(name, root);
  }
}