package com.bassclass;
    import java.awt.AWTException;
	import org.junit.Assert;
	import java.awt.Robot;
	import java.io.File;
	import java.sql.Date;
	import java.time.Duration;
	import java.util.ArrayList;
	import java.util.List;
	import java.util.logging.FileHandler;

	import org.openqa.selenium.Alert;
	import org.openqa.selenium.JavascriptExecutor;
	import org.openqa.selenium.OutputType;
	import org.openqa.selenium.TakesScreenshot;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.chrome.ChromeDriver;
	import org.openqa.selenium.edge.EdgeDriver;
	import org.openqa.selenium.firefox.FirefoxDriver;
	import org.openqa.selenium.interactions.Actions;
	import org.openqa.selenium.support.ui.ExpectedConditions;
	import org.openqa.selenium.support.ui.Select;
	import org.openqa.selenium.support.ui.WebDriverWait;

	public abstract class BaseClass {
		
	           
				public static WebDriver driver;
				private static Select selectOption;
				//launch browser
					protected static void launchBrowser(String browserName) {
						try {
							if(browserName.equalsIgnoreCase("chrome")) {
							driver=new ChromeDriver();
						}else if(browserName.equalsIgnoreCase("Edge")) {
							driver=new EdgeDriver();
						}else if (browserName.endsWith("Fiefox")) {
							driver=new FirefoxDriver();
						}
				  } catch (Exception e) {
				      Assert.fail("Error");
					  }
				      driver.manage().window().maximize();
					}
					//launch url
					protected static void launchUrl(String Url) {
						try {
							driver.get(Url);
						} catch (Exception e) {
						 Assert.fail("Error");
						}
					}
						//GET CURRENT URL
						protected static void getCurrentUrl() {
							try {
								System.out.println(driver.getCurrentUrl());
							} catch (Exception e) {
								Assert.fail("ERROR : OCCURED IN GETTING CURRENT URL");
							}
						}
							//GET TITLE
							protected static void getTitle() {
								try {
									System.out.println(driver.getTitle());
								} catch (Exception e) {
									Assert.fail("ERROR : OCCURED IN GETTING TITLE");
								}
							}
								//GET PAGE SOURCE
								protected static void getPageSource() {
									try {
										System.out.println(driver.getPageSource());
									} catch (Exception e) {
										Assert.fail("ERROR : OCCURED IN GETTING TITLE");
									}
								      }
								//BROWSER CLOSE AND QUIT
								protected static void closeBrowser(String type) {
									try {
										if (type.equalsIgnoreCase(type)) {
											driver.close();
										} else if (type.equalsIgnoreCase(type)) {
											driver.quit();
										}
									} catch (Exception e) {
										Assert.fail("ERROR : OCCURED IN CLOSING BROWSER");
									}
								}
								//NAVIGATE TO
								protected static void navigateTo(String newurl) {
									try {
										driver.navigate().to(newurl);
									} catch (Exception e) {
										Assert.fail("ERROR: OCCURED IN NAVIGATING TO NEW URL");
									}
								}

							//NAVIGATE BACK, REFRESH,FORWARD
								protected static void navigateMethods(String element) { 
									try {
										if (element.equalsIgnoreCase("back")) {
											driver.navigate().back();
										} else if (element.equalsIgnoreCase("refresh")) {
											driver.navigate().refresh();

										} else if (element.equalsIgnoreCase("forward")) {
											driver.navigate().forward();
										}
									} catch (Exception e) {
									Assert.fail("ERROR: OCCURED IN NAVIGATION METHODS");
									}
									}
								//sendKeys		
							protected static void inputPassing(WebElement element) {
								try {
									element.sendKeys();
								} catch (Exception e) {
									Assert.fail("ERROR OCCURED IN PASSING INPUTS");
								}
							}
							//click element
						protected static void elementClick(WebElement element) {
							try {
								element.click();

							} catch (Exception e) {
								Assert.fail("ERROR OCCURED IN CLICKING ELEMENT");
							}
							}
						//ALERT ACCEPT/DISMISS
						      	protected static void alertMethods(String type) {
						      		try {
						      			Alert alert = driver.switchTo().alert();
						      			if (type.equalsIgnoreCase("accept")) {
						      				alert.accept();
						      			} else if (type.equalsIgnoreCase("dismiss")) {
						      				alert.dismiss();
						      			}
						      		} catch (Exception e) {
						      			Assert.fail("ERROR:OCCURED IN ALERT ACCEPT OR DISMISS METHODS");
						      		}
						      	}
						      	//ALERT SEND KEYS
						      	protected static void alertInput(WebElement element, String input) {
						      		try {
						      			Alert alert = driver.switchTo().alert();
						      			alert.sendKeys(input);
						      		} catch (Exception e) {
						      			Assert.fail("ERROR OCCURED IN PASSING ALERT INPUTS");
						      			}
						      	}
						      	//ALERT GET TEXT
						      	protected static void alertGetText(WebElement element) {
						      		try {
						      			Alert alert = driver.switchTo().alert();
						      			System.out.println(alert.getText());

						      		} catch (Exception e) {
						      			Assert.fail("ERROR OCCURED IN GETTING ALERT GET TEXT");
						      		}
						      	}
	                            //SELECT VALUE,INDEX,VISIBLE TEXT
							protected static void selectOptions(WebElement element, String type, String value) {
								try {
									Select select = new Select(element);
									if (type.equalsIgnoreCase("value")) {
										select.selectByValue(value);
									} else if (type.equalsIgnoreCase("index")) {
										select.selectByIndex(Integer.parseInt(value));
									} else if (type.equalsIgnoreCase("text")) {
										select.selectByVisibleText(value);
									}
									} catch (Exception e) {
									Assert.fail("ERROR OCCURED IN SELECTING VALUES/INDEX/TEXT");
									}
							}
							//DESELECT VALUE,INDEX,VISIBLE TEXT
							protected static void deselectOptions(WebElement element, String type, String value) {
								try {
									Select select = new Select(element);
									if (type.equalsIgnoreCase("value")) {
										select.deselectByValue(value);
									} else if (type.equalsIgnoreCase("index")) {
										select.deselectByIndex(Integer.parseInt(value));
									} else if (type.equalsIgnoreCase("text")) {
										select.deselectByVisibleText(value);
									}
									} catch (Exception e) {
									Assert.fail("ERROR OCCURED IN DE-SELECTING VALUES/INDEX/TEXT");
								}
							}
							//TO CHECK WHETHER SELECT IS ENABLED, DISPLAYED OR IS SELECTED
							protected static void selectOtherOptions(WebElement element, String type) {
								try {
									new Select(element);
									if (type.equalsIgnoreCase("is enabled")) {
										System.out.println(element.isEnabled());
									} else if (type.equalsIgnoreCase("is displayed")) {
										System.out.println(element.isDisplayed());
									} else if (type.equalsIgnoreCase("is selected")) {
										System.out.println(element.isSelected());
									}
								} catch (Exception e) {
									Assert.fail("ERROR OCCURED IN OTHER SELECT OPTIONS");
								}
							}
							//DROP DOWN GET TEXT
							protected static void dropDownGetOptions(WebElement element) {
								try {
									Select select = new Select(element);
									List<WebElement> getOptions = select.getOptions();
									for (WebElement list : getOptions) {
										System.out.println(list.getText());
									}
								} catch (Exception e) {
									Assert.fail("ERROR OCCURED IN PRINTING DROP DOWN GET OPTIONS");
								}
							}

						//DROP DOWN GET 1ST SELECTED OPTION
							protected static void dropDownGetFirstSelectedOptions(WebElement element) {
								try {
									Select select = new Select(element);
									WebElement get1stSelectedOption = select.getFirstSelectedOption();
									System.out.println(get1stSelectedOption.getText());

								} catch (Exception e) {
									Assert.fail("ERROR OCCURED IN PRINTING GET FIRST SELECTED OPTIONS");
								}
							}

						// DROP DOWN GET ALL SELECTED OPTIONS
							protected static void dropDownGetAllSelectedOptions(WebElement element) {
								try {
									Select select = new Select(element);
									List<WebElement> getAllSelectedOptions = select.getAllSelectedOptions();
									for (WebElement list : getAllSelectedOptions) {
										System.out.println(list.getText());
									}
								} catch (Exception e) {
									Assert.fail("ERROR OCCURED IN PRINTING DROP DOWN GET ALL SELECTED OPTIONS");
								}
							}

						//DROP DOWN IS MULTIPLE OR NOT
							protected static void dropDownIsMultiple(WebElement elements) {
								try {
									Select select = new Select(elements);
									System.out.println(select.isMultiple());
								} catch (Exception e) {
									Assert.fail("ERROR OCCURED IN PRINTING WHETHER SELECTED DROPDOWN IS HAVING MULTIPLE OPTIONS");
								}
							}
							// WEB ELEMENT GET ATTRIBUTE
							protected static void getAttribute(WebElement element, String name) {
								try {
									System.out.println(element.getAttribute(name));

								} catch (Exception e) {
									Assert.fail("ERROR OCCURED GETTING ATTRIBUTE VALUE");
								}
							}
							//ACTION CLASS CLICK,DOUBLE CLICK, CONTEXT CLICK, MOVE TO ELEMENT
							protected static void actionClassOptions(WebElement element, String type) {
								try {
									Actions act = new Actions(driver);
									if (type.equalsIgnoreCase("actionclick")) {
										act.click(element).perform();
									} else if (type.equalsIgnoreCase("actiondoubleclick")) {
										act.doubleClick(element).perform();
									} else if (type.equalsIgnoreCase("contextclick")) {
										act.contextClick(element).perform();
									} else if (type.equalsIgnoreCase("movetoelement")) {
										act.moveToElement(element).perform();
									}
								}

								catch (Exception e) {
									Assert.fail("ERROR OCCURED IN ACTION CLASS OPTIONS");
								}
							}

						//ACTION CLASS DRAG AND DROP 
							protected static void actionDragAndDropOptions(WebElement element, WebElement element1) {
								try {
									Actions act = new Actions(driver);
									act.dragAndDrop(element, element1).click().build().perform();

								} catch (Exception e) {
									Assert.fail("ERROR OCCURED IN ACTION CLASS DRAG AND DROP OPTIONS");
								}
							}

						//GET WINDOW HANDLES
							protected static void getWindowHandles(int number) {
								try {
									List<String> allWindows = new ArrayList<>(driver.getWindowHandles());
									driver.switchTo().window(allWindows.get(number));
								} catch (Exception e) {
									Assert.fail("ERROR OCCURED IN GETTING WINDOW HANDLES");
								}
							}

						//FRAMES ID
							protected static void framesID(String string) {
								try {
									driver.switchTo().frame(string);
								} catch (Exception e) {
									Assert.fail("ERROR OCCURED IN GETTING FRAME ID");
								}
							}

						//FRAMES INDEX
							protected static void framesIndex(int value) {
								try {
									driver.switchTo().frame(value);
								} catch (Exception e) {
									Assert.fail("ERROR OCCURED IN GETTING FRAME Index");
								}
							}

						//FRAMES WEBELEMENT
							protected static void framesWebelement(WebElement element) {
								try {
									driver.switchTo().frame(element);
								} catch (Exception e) {
									Assert.fail("ERROR OCCURED IN GETTING FRAMES WEBELEMENT");
								}
							}

						//FRAMES EXIT AND GETTING TO OUTER FRAME
							protected static void frameExitAndOuterFrame(String type) {
								try {
									if (type.equalsIgnoreCase("exitframe")) {
										driver.switchTo().defaultContent();
									} else if (type.equalsIgnoreCase("parentframe")) {
										driver.switchTo().parentFrame();

									}
								} catch (Exception e) {
									Assert.fail("ERROR OCCURED IN EXITING FRAMES");
								}
							}

						//ROBOT METHODS KEY PRESS
							protected static void robotMethods(int number) {
								try {
									Robot rob = new Robot();
									rob.keyPress(number);
									rob.keyRelease(number);
								} catch (Exception e) {
									Assert.fail("ERROR OCCURED IN ROBOT KEY PRESS OR RELEASE");
								}
							}

						// IMPLICIT WAIT
							protected static void implicitWait(int duration) {
								try {driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(duration));

								} catch (Exception e) {
									Assert.fail("ERROR OCCURED IN IMPLICIT WAIT METHOD");
								}
							}

						// EXPLICIT WAIT
							protected static void explicitWait(WebElement element, int duration) {
								try {
									WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(duration));
									wait.until(ExpectedConditions.visibilityOf(element));

								} catch (Exception e) {
									Assert.fail("ERROR OCCURED IN EXPLICIT WAIT METHOD");
								}
							}

						//SCRRENSHOT
							protected static void screenshot() {
								try {
									TakesScreenshot ts = (TakesScreenshot) driver;
									Date currentDate = new Date(0);
									System.out.println(currentDate);
									String dateFile = currentDate.toString().replace(" ", "_").replace(":", "_");
									File source = ts.getScreenshotAs(OutputType.FILE);
									File store = new File(".//Screenshots//" + dateFile + ".png");
									//FileHandler.copy(source, store);
								} catch (Exception e) {
									Assert.fail("ERROR OCCURED IN SCREEN CAPTURE");
								}
							}

						//SCROLL DOWN
							protected static void javascriptExecutorScrollDown(long number1) {
								try {
									JavascriptExecutor jse = (JavascriptExecutor) driver;
									jse.executeScript("window.scrollBy(0," + number1 + ")", "");

								} catch (Exception e) {
									Assert.fail("ERROR OCCURED IN SCROLL DOWN");
								}
							}

						//SCROLL UP
							protected static void javascriptExecutorScrollUp(long number1) {
								try {
									JavascriptExecutor jse = (JavascriptExecutor) driver;
									jse.executeScript("window.scrollBy(0,-" + number1 + ")", "");

								} catch (Exception e) {
									Assert.fail("ERROR OCCURED IN SCROLL UP");
								}
							}

						//SCROLL INTO VIEW
							protected static void javascriptExecutorScrollintoView(long number) {
								try {
									JavascriptExecutor jse = (JavascriptExecutor) driver;
									jse.executeScript("window.scrollBy(arguments[0], 0", number);
								} catch (Exception e) {
									Assert.fail("ERROR OCCURED IN SCROLL INTO VIEW");
								}
							}

						//JAVA SCRIPT EXECUTOR SEND KEYS
							protected static void javascriptExecutorSendKeys(WebElement element, String value) {
								try {
									JavascriptExecutor jse = (JavascriptExecutor) driver;
									jse.executeScript("arguments[0].value=arguments[1];", element, value);
								} catch (Exception e) {
									Assert.fail("ERROR OCCURED IN JAVASCRIPT EXECUTOR SEND KEYS");
								}
							}

						//JAVA SCRIPT EXECUTOR CLICK	
							protected static void javascriptExecutorClick(WebElement element) {
								try {
									JavascriptExecutor jse = (JavascriptExecutor) driver;
									jse.executeScript("arguments[0].click()", element);
								} catch (Exception e) {
									Assert.fail("ERROR OCCURED IN JAVASCRIPT EXECUTOR CLICK");
								}
							}

						//GET TEXT	
							protected static void getText(WebElement element) {
								try {
									String i = element.getText();
									
									System.out.println(i);
								} catch (Exception e) {
									Assert.fail("ERROR OCCURED IN RETRIEVING TEXT");
								}
							

						         }
						              
						              }
		      




