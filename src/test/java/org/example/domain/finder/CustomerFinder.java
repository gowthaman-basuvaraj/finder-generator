package org.example.domain.finder;

import io.ebean.Finder;
import org.example.domain.Customer;
import org.example.domain.query.QCustomer;

public class CustomerFinder extends Finder<Long,Customer> {

  /**
   * Construct using the default EbeanServer.
   */
  public CustomerFinder() {
    super(Customer.class);
  }

  /**
   * Construct with a given EbeanServer.
   */
  public CustomerFinder(String serverName) {
    super(Customer.class, serverName);
  }

  /**
   * Start a new typed query.
   */
  protected QCustomer where() {
     return new QCustomer(db());
  }

  /**
   * Start a new document store query.
   */
  protected QCustomer text() {
     return new QCustomer(db()).text();
  }
}
