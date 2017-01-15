package fr.dja.mbean;



import java.util.Enumeration;

import org.apache.log4j.Level;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;

public class Log4jLevelChanger implements Log4jLevelChangerMBean {

	public void setLogLevel(String loggerName, String level) {
		System.out.println("Invocation changement sur " + loggerName + " avec le niveau " + level);
	                if ("debug".equalsIgnoreCase(level)) {
	                    Logger.getLogger(loggerName).setLevel(Level.DEBUG);
	               } else if ("info".equalsIgnoreCase(level)) {
	                      Logger.getLogger(loggerName).setLevel(Level.INFO);
	                } else if ("error".equalsIgnoreCase(level)) {
	                     Logger.getLogger(loggerName).setLevel(Level.ERROR);
	               } else if ("fatal".equalsIgnoreCase(level)) {
	                     Logger.getLogger(loggerName).setLevel(Level.FATAL);
	               } else if ("warn".equalsIgnoreCase(level)) {
	                      Logger.getLogger(loggerName).setLevel(Level.WARN);
	                } else if ("trace".equalsIgnoreCase(level)) {
	                     Logger.getLogger(loggerName).setLevel(Level.TRACE);
	               } else if ("off".equalsIgnoreCase(level)) {
	                       Logger.getLogger(loggerName).setLevel(Level.OFF);
	         } else if ("all".equalsIgnoreCase(level)) {
	                       Logger.getLogger(loggerName).setLevel(Level.ALL);
	         }
	 
	}

	public void printlogger() {
		for (Enumeration loggers = LogManager.getCurrentLoggers(); loggers.hasMoreElements();) {
			Logger logger = (Logger) loggers.nextElement();
			System.out.println("Logger " + logger.getName() + " level " + logger.getLevel());
			System.out.println("Logger repo " + logger.getLoggerRepository());
		}

	}
	/*
	 * @Override public Object getAttribute(String arg0) throws
	 * AttributeNotFoundException, MBeanException, ReflectionException {
	 * 
	 * return Logger.getLogger(arg0).getLevel(); }
	 * 
	 * @Override public AttributeList getAttributes(String[] arg0) { // TODO
	 * Auto-generated method stub AttributeList attributeList = new
	 * AttributeList(); for (int i = 0; i < arg0.length; i++) {
	 * attributeList.add(new Attribute(arg0[i], Logger.getLogger(arg0[i]))); }
	 * return attributeList; }
	 * 
	 * @Override public MBeanInfo getMBeanInfo() { MBeanAttributeInfo[]
	 * attributeInfos = new MBeanAttributeInfo[1]; Class zz = null; try { zz =
	 * Class.forName("fr.dja.util.Log4jLevelChanger"); } catch
	 * (ClassNotFoundException e) { // TODO Auto-generated catch block
	 * e.printStackTrace(); } try { attributeInfos[0] = new
	 * MBeanAttributeInfo("Level", "Level", zz.getMethod("getAttribute",
	 * String.class), zz.getMethod("setAttribute", Attribute.class)); } catch
	 * (IntrospectionException | NoSuchMethodException | SecurityException e) {
	 * // TODO Auto-generated catch block e.printStackTrace(); } MBeanInfo
	 * beanInfo = new MBeanInfo("Log4jLevelChanger", "description",
	 * attributeInfos, null, null, null); // TODO Auto-generated method stub
	 * return beanInfo; }
	 * 
	 * @Override public Object invoke(String arg0, Object[] arg1, String[] arg2)
	 * throws MBeanException, ReflectionException { // TODO Auto-generated
	 * method stub return null; }
	 * 
	 * @Override public void setAttribute(Attribute arg0) throws
	 * AttributeNotFoundException, InvalidAttributeValueException,
	 * MBeanException, ReflectionException { setLogLevel(arg0.getName(),
	 * (String) arg0.getValue());
	 * 
	 * }
	 * 
	 * @Override public AttributeList setAttributes(AttributeList arg0) { for
	 * (int i = 0; i < arg0.size(); i++) { Attribute at = (Attribute)
	 * arg0.get(i); setLogLevel(at.getName(), (String) at.getValue()); } return
	 * null; }
	 */
}