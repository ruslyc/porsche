Feature: Porsche test
  @porsche
  Scenario: Porsche Car build test
    Given User goes to porsche application car configurator module
    And User selects model seven zero eight
    And User remembers the price of seven zero eight Cayman Model S
    And User clicks on Click on seven zero eight Cayman S
    And User verifies that Base price displayed on the page is same as the price from step three
    And User verifies that Price for Equipment is zero
    And User verifies that total price is the sum of base price plus Delivery, Processing and Handling Fee
    And User selects color Miami Blue
    And User verifies that Price for Equipment is Equal to Miami Blue price
    And User verifies that total price is the sum of base price plus Price for Equipment plus Delivery, Processing and Handling Feee
    And User selects twenty inch Carrera Sport Wheels
    And User verifies that Price for Equipment is the sum of Miami Blue price plus twenty inch Carrera Sport Wheels
    And User Verifies that total price is the sum of base price plus Price for Equipment plus Delivery, Processing and Handling Fee
    And User selects seats Power Sport Seats fourteen way with Memory Package
    And User verifies that Price for Equipment is the sum of Miami Blue price plus twenty inch Carrera Sport Wheels plus Power Sport Seats fourteen way with Memory Package
    And User Verifies that total price is the sum of base price plus Price for Equipment plus Delivery,Processing and Handling Fe
    And User clicks on Interior Carbon Fiber
    And User selects Interior Trim in Carbon Fiber i.c.w. Standard Interior
    And User verifies that Price for Equipment is the sum of Miami Blue price plus twenty Carrera Sport Wheels plus Power Sport Seats fourteen way with Memory Package plus Interior Trim inCarbon Fiber i.c.w.Standard Interior
    And User verifies that total price is the sum of base price plus Price for Equipment plus Delivery,Processing and Handling Fee
    And User clicks on Performance
    And User selects seven speed Porsche Doppelkupplung PDK
    And User selects Porsche Ceramic Composite Brakes PCCB
    And User Verify that Price for Equipment is the sum of Miami Blue price plus twenty inch Carrera SportWheelsplus Power Sport Seats fourteen way with Memory Package  plus Interior Trim in Carbon Fiber i.c.w.Standard Interior plus seven speed Porsche Doppelkupplung PDK plus Porsche Ceramic CompositeBrakes PCCB
    And User Verify that total price is the sum of base price plus Price for Equipment plus Delivery, Processingand Handling Fee
