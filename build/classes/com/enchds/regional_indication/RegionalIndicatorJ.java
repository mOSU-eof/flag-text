<?xml version="1.0" encoding="UTF-8" ?>

<Form version="1.3" maxVersion="1.9" type="org.netbeans.modules.form.forminfo.JFrameFormInfo">
  <Properties>
    <Property name="defaultCloseOperation" type="int" value="3"/>
    <Property name="maximumSize" type="java.awt.Dimension" editor="org.netbeans.beaninfo.editors.DimensionEditor">
      <Dimension value="[2147483647, 85]"/>
    </Property>
    <Property name="minimumSize" type="java.awt.Dimension" editor="org.netbeans.beaninfo.editors.DimensionEditor">
      <Dimension value="[100, 85]"/>
    </Property>
  </Properties>
  <SyntheticProperties>
    <SyntheticProperty name="formSizePolicy" type="int" value="1"/>
    <SyntheticProperty name="generateCenter" type="boolean" value="false"/>
  </SyntheticProperties>
  <AuxValues>
    <AuxValue name="FormSettings_autoResourcing" type="java.lang.Integer" value="0"/>
    <AuxValue name="FormSettings_autoSetComponentName" type="java.lang.Boolean" value="false"/>
    <AuxValue name="FormSettings_generateFQN" type="java.lang.Boolean" value="true"/>
    <AuxValue name="FormSettings_generateMnemonicsCode" type="java.lang.Boolean" value="false"/>
    <AuxValue name="FormSettings_i18nAutoMode" type="java.lang.Boolean" value="false"/>
    <AuxValue name="FormSettings_layoutCodeTarget" type="java.lang.Integer" value="1"/>
    <AuxValue name="FormSettings_listenerGenerationStyle" type="java.lang.Integer" value="0"/>
    <AuxValue name="FormSettings_variablesLocal" type="java.lang.Boolean" value="false"/>
    <AuxValue name="FormSettings_variablesModifier" type="java.lang.Integer" value="2"/>
  </AuxValues>

  <Layout>
    <DimensionLayout dim="0">
      <Group type="103" groupAlignment="0" attributes="0">
          <Group type="102" alignment="0" attributes="0">
              <EmptySpace min="-2" pref="9" max="-2" attributes="0"/>
              <Group type="103" groupAlignment="1" attributes="0">
                  <Component id="jLabel1" min="-2" max="-2" attributes="0"/>
                  <Component id="jLabel2" min="-2" max="-2" attributes="0"/>
              </Group>
              <EmptySpace min="-2" max="-2" attributes="0"/>
              <Group type="103" groupAlignment="0" attributes="0">
                  <Component id="jTextField1" pref="213" max="32767" attributes="0"/>
                  <Component id="jTextField2" max="32767" attributes="0"/>
              </Group>
              <EmptySpace min="-2" max="-2" attributes="0"/>
              <Group type="103" groupAlignment="0" attributes="0">
                  <Component id="jButton3" min="-2" max="-2" attributes="0"/>
                  <Component id="jButton4" min="-2" max="-2" attributes="0"/>
              </Group>
              <EmptySpace min="-2" max="-2" attributes="0"/>
              <Group type="103" groupAlignment="0" attributes="0">
                  <Component id="jButton1" min="-2" max="-2" attributes="0"/>
                  <Component id="jButton2" min="-2" max="-2" attributes="0"/>
              </Group>
          </Group>
      </Group>
    </DimensionLayout>
    <DimensionLayout dim="1">
      <Group type="103" groupAlignment="0" attributes="0">
          <Group type="102" attributes="0">
              <Group type="103" groupAlignment="3" attributes="0">
                  <Component id="jTextField1" alignment="3" min="-2" max="-2" attributes="0"/>
                  <Component id="jButton1" alignment="3" min="-2" max="-2" attributes="0"/>
                  <Component id="jLabel1" alignment="3" min="-2" max="-2" attributes="0"/>
                  <Component id="jButton3" alignment="3" min="-2" max="-2" attributes="0"/>
              </Group>
              <EmptySpace max="-2" attributes="0"/>
              <Group type="103" groupAlignment="0" attributes="0">
                  <Group type="103" groupAlignment="3" attributes="0">
                      <Component id="jTextField2" alignment="3" min="-2" max="-2" attributes="0"/>
                      <Component id="jButton2" alignment="3" min="-2" max="-2" attributes="0"/>
                      <Component id="jButton4" alignment="3" min="-2" max="-2" attributes="0"/>
                  </Group>
                  <Component id="jLabel2" alignment="0" min="-2" max="-2" attributes="0"/>
              </Group>
          </Group>
      </Group>
    </DimensionLayout>
  </Layout>
  <SubComponents>
    <Component class="javax.swing.JTextField" name="jTextField1">
      <Events>
        <EventHandler event="actionPerformed" listener="java.awt.event.ActionListener" parameters="java.awt.event.ActionEvent" handler="jTextField1ActionPerformed"/>
        <EventHandler event="propertyChange" listener="java.beans.PropertyChangeListener" parameters="java.beans.PropertyChangeEvent" handler="jTextField1PropertyChange"/>
      </Events>
    </Component>
    <Component class="javax.swing.JLabel" name="jLabel1">
      <Properties>
        <Property name="text" type="java.lang.String" value="Standard Text:"/>
      </Properties>
    </Component>
    <Component class="javax.swing.JButton" name="jButton1">
      <Properties>
        <Property name="text" type="java.lang.String" value="Copy"/>
      </Properties>
      <Events>
        <EventHandler event="actionPerformed" listener="java.awt.event.ActionListener" parameters="java.awt.event.ActionEvent" handler="jButton1ActionPerformed"/>
      </Events>
    </Component>
    <Component class="javax.swing.JLabel" name="jLabel2">
      <Properties>
        <Property name="text" type="java.lang.String" value="Flag Text:"/>
      </Properties>
    </Component>
    <Component class="javax.swing.JTextField" name="jTextField2">
      <Events>
        <EventHandler event="actionPerformed" listener="java.awt.event.ActionListener" parameters="java.awt.event.ActionEvent" handler="jTextField2ActionPerformed"/>
      </Events>
    </Component>
    <Component class="javax.swing.JButton" name="jButton2">
      <Properties>
        <Property name="text" type="java.lang.String" value="Copy"/>
      </Properties>
      <Events>
        <EventHandler event="actionPerformed" listener="java.awt.event.ActionListener" parameters="java.awt.event.ActionEvent" handler="jButton2ActionPerformed"/>
      </Events>
    </Component>
    <Component class="javax.swing.JButton" name="jButton3">
      <Properties>
        <Property name="text" type="java.lang.String" value="Paste"/>
      </Properties>
      <Events>
        <EventHandler event="actionPerformed" listener="java.awt.event.ActionListener" parameters="java.awt.event.ActionEvent" handler="jButton3ActionPerformed"/>
      </Events>
    </Component>
    <Component class="javax.swing.JButton" name="jButton4">
      <Properties>
        <Property name="text" type="java.lang.String" value="Paste"/>
      </Properties>
      <Events>
        <EventHandler event="actionPerformed" listener="java.awt.event.ActionListener" parameters="java.awt.event.ActionEvent" handler="jButton4ActionPerformed"/>
      </Events>
    </Component>
  </SubComponents>
</Form>