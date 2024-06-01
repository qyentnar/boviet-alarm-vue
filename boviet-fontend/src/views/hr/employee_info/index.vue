<template>
  <div class="app-container">
    <el-form :model="queryParams" ref="queryForm" size="small" :inline="true" v-show="showSearch" label-width="68px">
      <el-form-item :label="`${this.$i18n.t('lbl.employee_info.fullName')}`" prop="fullName">
        <el-input
          v-model="queryParams.fullName"
          :placeholder="`${this.$i18n.t('plh.employee_info.fullName')}`"
          clearable
          @keyup.enter.native="handleQuery"
        />
      </el-form-item>
      <el-form-item :label="`${this.$i18n.t('lbl.employee_info.gender')}`" prop="gender">
        <el-input
          v-model="queryParams.gender"
          :placeholder="`${this.$i18n.t('plh.employee_info.gender')}`"
          clearable
          @keyup.enter.native="handleQuery"
        />
      </el-form-item>
      <el-form-item :label="`${this.$i18n.t('lbl.employee_info.birthDate')}`" prop="birthDate">
        <el-date-picker clearable
          v-model="queryParams.birthDate"
          type="date"
          value-format="yyyy-MM-dd"
          :placeholder="`${this.$i18n.t('plh.employee_info.birthDate')}`">
        </el-date-picker>
      </el-form-item>
      <el-form-item :label="`${this.$i18n.t('lbl.employee_info.politicalAffiliation')}`" prop="politicalAffiliation">
        <el-input
          v-model="queryParams.politicalAffiliation"
          :placeholder="`${this.$i18n.t('plh.employee_info.politicalAffiliation')}`"
          clearable
          @keyup.enter.native="handleQuery"
        />
      </el-form-item>
      <el-form-item :label="`${this.$i18n.t('lbl.employee_info.childrenCount')}`" prop="childrenCount">
        <el-input
          v-model="queryParams.childrenCount"
          :placeholder="`${this.$i18n.t('plh.employee_info.childrenCount')}`"
          clearable
          @keyup.enter.native="handleQuery"
        />
      </el-form-item>
      <el-form-item :label="`${this.$i18n.t('lbl.employee_info.idNumber')}`" prop="idNumber">
        <el-input
          v-model="queryParams.idNumber"
          :placeholder="`${this.$i18n.t('plh.employee_info.idNumber')}`"
          clearable
          @keyup.enter.native="handleQuery"
        />
      </el-form-item>
      <el-form-item :label="`${this.$i18n.t('lbl.employee_info.idAddress')}`" prop="idAddress">
        <el-input
          v-model="queryParams.idAddress"
          :placeholder="`${this.$i18n.t('plh.employee_info.idAddress')}`"
          clearable
          @keyup.enter.native="handleQuery"
        />
      </el-form-item>
      <el-form-item :label="`${this.$i18n.t('lbl.employee_info.contactAddress')}`" prop="contactAddress">
        <el-input
          v-model="queryParams.contactAddress"
          :placeholder="`${this.$i18n.t('plh.employee_info.contactAddress')}`"
          clearable
          @keyup.enter.native="handleQuery"
        />
      </el-form-item>
      <el-form-item :label="`${this.$i18n.t('lbl.employee_info.mobilePhone')}`" prop="mobilePhone">
        <el-input
          v-model="queryParams.mobilePhone"
          :placeholder="`${this.$i18n.t('plh.employee_info.mobilePhone')}`"
          clearable
          @keyup.enter.native="handleQuery"
        />
      </el-form-item>
      <el-form-item :label="`${this.$i18n.t('lbl.employee_info.bankAccountNumber')}`" prop="bankAccountNumber">
        <el-input
          v-model="queryParams.bankAccountNumber"
          :placeholder="`${this.$i18n.t('plh.employee_info.bankAccountNumber')}`"
          clearable
          @keyup.enter.native="handleQuery"
        />
      </el-form-item>
      <el-form-item :label="`${this.$i18n.t('lbl.employee_info.bankName')}`" prop="bankName">
        <el-input
          v-model="queryParams.bankName"
          :placeholder="`${this.$i18n.t('plh.employee_info.bankName')}`"
          clearable
          @keyup.enter.native="handleQuery"
        />
      </el-form-item>
      <el-form-item :label="`${this.$i18n.t('lbl.employee_info.height')}`" prop="height">
        <el-input
          v-model="queryParams.height"
          :placeholder="`${this.$i18n.t('plh.employee_info.height')}`"
          clearable
          @keyup.enter.native="handleQuery"
        />
      </el-form-item>
      <el-form-item :label="`${this.$i18n.t('lbl.employee_info.weight')}`" prop="weight">
        <el-input
          v-model="queryParams.weight"
          :placeholder="`${this.$i18n.t('plh.employee_info.weight')}`"
          clearable
          @keyup.enter.native="handleQuery"
        />
      </el-form-item>
      <el-form-item :label="`${this.$i18n.t('lbl.employee_info.uniformSize')}`" prop="uniformSize">
        <el-input
          v-model="queryParams.uniformSize"
          :placeholder="`${this.$i18n.t('plh.employee_info.uniformSize')}`"
          clearable
          @keyup.enter.native="handleQuery"
        />
      </el-form-item>
      <el-form-item :label="`${this.$i18n.t('lbl.employee_info.dormitoryResident')}`" prop="dormitoryResident">
        <el-input
          v-model="queryParams.dormitoryResident"
          :placeholder="`${this.$i18n.t('plh.employee_info.dormitoryResident')}`"
          clearable
          @keyup.enter.native="handleQuery"
        />
      </el-form-item>
      <el-form-item :label="`${this.$i18n.t('lbl.employee_info.firstJobDate')}`" prop="firstJobDate">
        <el-date-picker clearable
          v-model="queryParams.firstJobDate"
          type="date"
          value-format="yyyy-MM-dd"
          :placeholder="`${this.$i18n.t('plh.employee_info.firstJobDate')}`">
        </el-date-picker>
      </el-form-item>
      <el-form-item :label="`${this.$i18n.t('lbl.employee_info.nativePlace')}`" prop="nativePlace">
        <el-input
          v-model="queryParams.nativePlace"
          :placeholder="`${this.$i18n.t('plh.employee_info.nativePlace')}`"
          clearable
          @keyup.enter.native="handleQuery"
        />
      </el-form-item>
      <el-form-item :label="`${this.$i18n.t('lbl.employee_info.ethnicity')}`" prop="ethnicity">
        <el-input
          v-model="queryParams.ethnicity"
          :placeholder="`${this.$i18n.t('plh.employee_info.ethnicity')}`"
          clearable
          @keyup.enter.native="handleQuery"
        />
      </el-form-item>
      <el-form-item :label="`${this.$i18n.t('lbl.employee_info.lastName')}`" prop="lastName">
        <el-input
          v-model="queryParams.lastName"
          :placeholder="`${this.$i18n.t('plh.employee_info.lastName')}`"
          clearable
          @keyup.enter.native="handleQuery"
        />
      </el-form-item>
      <el-form-item :label="`${this.$i18n.t('lbl.employee_info.firstName')}`" prop="firstName">
        <el-input
          v-model="queryParams.firstName"
          :placeholder="`${this.$i18n.t('plh.employee_info.firstName')}`"
          clearable
          @keyup.enter.native="handleQuery"
        />
      </el-form-item>
      <el-form-item :label="`${this.$i18n.t('lbl.employee_info.nationality')}`" prop="nationality">
        <el-input
          v-model="queryParams.nationality"
          :placeholder="`${this.$i18n.t('plh.employee_info.nationality')}`"
          clearable
          @keyup.enter.native="handleQuery"
        />
      </el-form-item>
      <el-form-item :label="`${this.$i18n.t('lbl.employee_info.passportNumber')}`" prop="passportNumber">
        <el-input
          v-model="queryParams.passportNumber"
          :placeholder="`${this.$i18n.t('plh.employee_info.passportNumber')}`"
          clearable
          @keyup.enter.native="handleQuery"
        />
      </el-form-item>
      <el-form-item :label="`${this.$i18n.t('lbl.employee_info.householdProvince')}`" prop="householdProvince">
        <el-input
          v-model="queryParams.householdProvince"
          :placeholder="`${this.$i18n.t('plh.employee_info.householdProvince')}`"
          clearable
          @keyup.enter.native="handleQuery"
        />
      </el-form-item>
      <el-form-item :label="`${this.$i18n.t('lbl.employee_info.idCardValidity')}`" prop="idCardValidity">
        <el-date-picker clearable
          v-model="queryParams.idCardValidity"
          type="date"
          value-format="yyyy-MM-dd"
          :placeholder="`${this.$i18n.t('plh.employee_info.idCardValidity')}`">
        </el-date-picker>
      </el-form-item>
      <el-form-item :label="`${this.$i18n.t('lbl.employee_info.email')}`" prop="email">
        <el-input
          v-model="queryParams.email"
          :placeholder="`${this.$i18n.t('plh.employee_info.email')}`"
          clearable
          @keyup.enter.native="handleQuery"
        />
      </el-form-item>
      <el-form-item :label="`${this.$i18n.t('lbl.employee_info.highestEducation')}`" prop="highestEducation">
        <el-input
          v-model="queryParams.highestEducation"
          :placeholder="`${this.$i18n.t('plh.employee_info.highestEducation')}`"
          clearable
          @keyup.enter.native="handleQuery"
        />
      </el-form-item>
      <el-form-item :label="`${this.$i18n.t('lbl.employee_info.otherRequired')}`" prop="otherRequired">
        <el-input
          v-model="queryParams.otherRequired"
          :placeholder="`${this.$i18n.t('plh.employee_info.otherRequired')}`"
          clearable
          @keyup.enter.native="handleQuery"
        />
      </el-form-item>
      <el-row>
        <el-col align="center">
          <el-form-item>
            <el-button type="primary" icon="el-icon-search" size="mini" @click="handleQuery">{{this.$i18n.t("btnSearch")}}</el-button>
            <el-button icon="el-icon-refresh" size="mini" @click="resetQuery">{{this.$i18n.t("btnReset")}}</el-button>
          </el-form-item>
        </el-col>
      </el-row>
    </el-form>

    <el-row :gutter="10" class="mb8">
      <el-col :span="1.5">
        <el-button
          type="primary"
          plain
          icon="el-icon-plus"
          size="mini"
          @click="handleAdd"
          v-hasPermi="['hr:employee_info:add']"
        >{{this.$i18n.t("btnAdd")}}</el-button>
      </el-col>
      <el-col :span="1.5">
        <el-button
          type="success"
          plain
          icon="el-icon-edit"
          size="mini"
          :disabled="single"
          @click="handleUpdate"
          v-hasPermi="['hr:employee_info:edit']"
        >{{this.$i18n.t("btnEdit")}}</el-button>
      </el-col>
      <el-col :span="1.5">
        <el-button
          type="danger"
          plain
          icon="el-icon-delete"
          size="mini"
          :disabled="multiple"
          @click="handleDelete"
          v-hasPermi="['hr:employee_info:remove']"
        >{{this.$i18n.t("btnRemove")}}</el-button>
      </el-col>
      <el-col :span="1.5">
        <el-button
          type="warning"
          plain
          icon="el-icon-download"
          size="mini"
          @click="handleExport"
          v-hasPermi="['hr:employee_info:export']"
        >{{this.$i18n.t("btnExport")}}</el-button>
      </el-col>
      <right-toolbar :showSearch.sync="showSearch" @queryTable="getList"></right-toolbar>
    </el-row>

    <el-table v-loading="loading" :data="employee_infoList" @selection-change="handleSelectionChange">
      <el-table-column type="selection" width="55" align="center" />
      <el-table-column :label="`${this.$i18n.t('lbl.employee_info.id')}`" align="center" prop="id" />
      <el-table-column :label="`${this.$i18n.t('lbl.employee_info.fullName')}`" align="center" prop="fullName" />
      <el-table-column :label="`${this.$i18n.t('lbl.employee_info.gender')}`" align="center" prop="gender">
        <template slot-scope="scope">
          <dict-tag :options="dict.type.sys_user_sex" :value="scope.row.gender"/>
        </template>
      </el-table-column>
      <el-table-column :label="`${this.$i18n.t('lbl.employee_info.birthDate')}`" align="center" prop="birthDate" width="180">
        <template slot-scope="scope">
          <span>{{ parseTime(scope.row.birthDate, '{y}-{m}-{d}') }}</span>
        </template>
      </el-table-column>
      <el-table-column :label="`${this.$i18n.t('lbl.employee_info.maritalStatus')}`" align="center" prop="maritalStatus" />
      <el-table-column :label="`${this.$i18n.t('lbl.employee_info.politicalAffiliation')}`" align="center" prop="politicalAffiliation" />
      <el-table-column :label="`${this.$i18n.t('lbl.employee_info.childrenCount')}`" align="center" prop="childrenCount" />
      <el-table-column :label="`${this.$i18n.t('lbl.employee_info.idNumber')}`" align="center" prop="idNumber" />
      <el-table-column :label="`${this.$i18n.t('lbl.employee_info.idAddress')}`" align="center" prop="idAddress" />
      <el-table-column :label="`${this.$i18n.t('lbl.employee_info.contactAddress')}`" align="center" prop="contactAddress" />
      <el-table-column :label="`${this.$i18n.t('lbl.employee_info.mobilePhone')}`" align="center" prop="mobilePhone" />
      <el-table-column :label="`${this.$i18n.t('lbl.employee_info.bankAccountNumber')}`" align="center" prop="bankAccountNumber" />
      <el-table-column :label="`${this.$i18n.t('lbl.employee_info.bankName')}`" align="center" prop="bankName" />
      <el-table-column :label="`${this.$i18n.t('lbl.employee_info.height')}`" align="center" prop="height" />
      <el-table-column :label="`${this.$i18n.t('lbl.employee_info.weight')}`" align="center" prop="weight" />
      <el-table-column :label="`${this.$i18n.t('lbl.employee_info.uniformSize')}`" align="center" prop="uniformSize" />
      <el-table-column :label="`${this.$i18n.t('lbl.employee_info.dormitoryResident')}`" align="center" prop="dormitoryResident" />
      <el-table-column :label="`${this.$i18n.t('lbl.employee_info.firstJobDate')}`" align="center" prop="firstJobDate" width="180">
        <template slot-scope="scope">
          <span>{{ parseTime(scope.row.firstJobDate, '{y}-{m}-{d}') }}</span>
        </template>
      </el-table-column>
      <el-table-column :label="`${this.$i18n.t('lbl.employee_info.householdType')}`" align="center" prop="householdType" />
      <el-table-column :label="`${this.$i18n.t('lbl.employee_info.nativePlace')}`" align="center" prop="nativePlace" />
      <el-table-column :label="`${this.$i18n.t('lbl.employee_info.ethnicity')}`" align="center" prop="ethnicity" />
      <el-table-column :label="`${this.$i18n.t('lbl.employee_info.bloodType')}`" align="center" prop="bloodType" />
      <el-table-column :label="`${this.$i18n.t('lbl.employee_info.idCardImage')}`" align="center" prop="idCardImage" width="100">
        <template slot-scope="scope">
          <image-preview :src="scope.row.idCardImage" :width="50" :height="50"/>
        </template>
      </el-table-column>
      <el-table-column :label="`${this.$i18n.t('lbl.employee_info.lastName')}`" align="center" prop="lastName" />
      <el-table-column :label="`${this.$i18n.t('lbl.employee_info.firstName')}`" align="center" prop="firstName" />
      <el-table-column :label="`${this.$i18n.t('lbl.employee_info.nationality')}`" align="center" prop="nationality" />
      <el-table-column :label="`${this.$i18n.t('lbl.employee_info.passportNumber')}`" align="center" prop="passportNumber" />
      <el-table-column :label="`${this.$i18n.t('lbl.employee_info.householdProvince')}`" align="center" prop="householdProvince" />
      <el-table-column :label="`${this.$i18n.t('lbl.employee_info.cardImage')}`" align="center" prop="cardImage" width="100">
        <template slot-scope="scope">
          <image-preview :src="scope.row.cardImage" :width="50" :height="50"/>
        </template>
      </el-table-column>
      <el-table-column :label="`${this.$i18n.t('lbl.employee_info.idCardValidity')}`" align="center" prop="idCardValidity" width="180">
        <template slot-scope="scope">
          <span>{{ parseTime(scope.row.idCardValidity, '{y}-{m}-{d}') }}</span>
        </template>
      </el-table-column>
      <el-table-column :label="`${this.$i18n.t('lbl.employee_info.email')}`" align="center" prop="email" />
      <el-table-column :label="`${this.$i18n.t('lbl.employee_info.highestEducation')}`" align="center" prop="highestEducation" />
      <el-table-column :label="`${this.$i18n.t('lbl.employee_info.educationType')}`" align="center" prop="educationType" />
      <el-table-column :label="`${this.$i18n.t('lbl.employee_info.otherRequired')}`" align="center" prop="otherRequired" />
      <el-table-column :label="`${this.$i18n.t('lbl.employee_info.healthReportImage')}`" align="center" prop="healthReportImage" width="100">
        <template slot-scope="scope">
          <image-preview :src="scope.row.healthReportImage" :width="50" :height="50"/>
        </template>
      </el-table-column>
      <el-table-column :label="`${this.$i18n.t('lbl.employee_info.bankCardImage')}`" align="center" prop="bankCardImage" width="100">
        <template slot-scope="scope">
          <image-preview :src="scope.row.bankCardImage" :width="50" :height="50"/>
        </template>
      </el-table-column>
      <el-table-column :label="`${this.$i18n.t('lbl.employee_info.idCardCopyImage')}`" align="center" prop="idCardCopyImage" width="100">
        <template slot-scope="scope">
          <image-preview :src="scope.row.idCardCopyImage" :width="50" :height="50"/>
        </template>
      </el-table-column>
      <el-table-column :label="`${this.$i18n.t('lbl.employee_info.jobConfirmImage')}`" align="center" prop="jobConfirmImage" width="100">
        <template slot-scope="scope">
          <image-preview :src="scope.row.jobConfirmImage" :width="50" :height="50"/>
        </template>
      </el-table-column>
      <el-table-column :label="`${this.$i18n.t('operate')}`" align="center" class-name="small-padding fixed-width">
        <template slot-scope="scope">
          <el-button
            size="mini"
            type="text"
            icon="el-icon-edit"
            @click="handleUpdate(scope.row)"
            v-hasPermi="['hr:employee_info:edit']"
          >{{$i18n.t("btnEdit")}}</el-button>
          <el-button
            size="mini"
            type="text"
            icon="el-icon-delete"
            @click="handleDelete(scope.row)"
            v-hasPermi="['hr:employee_info:remove']"
          >{{$i18n.t("btnRemove")}}</el-button>
        </template>
      </el-table-column>
    </el-table>
    
    <pagination
      v-show="total>0"
      :total="total"
      :page.sync="queryParams.pageNum"
      :limit.sync="queryParams.pageSize"
      @pagination="getList"
    />

    <!-- 添加或修改个人基本信息对话框 -->
    <el-dialog :title="title" :visible.sync="open" width="640px" append-to-body>
      <el-form ref="form" :model="form" :rules="rules" label-width="120px">
        <el-form-item :label="`${this.$i18n.t('lbl.employee_info.fullName')}`" prop="fullName">
          <el-input v-model="form.fullName" :placeholder="`${this.$i18n.t('plh.employee_info.fullName')}`" />
        </el-form-item>
        <el-form-item :label="`${this.$i18n.t('lbl.employee_info.gender')}`" prop="gender">
          <el-input v-model="form.gender" :placeholder="`${this.$i18n.t('plh.employee_info.gender')}`" />
        </el-form-item>
        <el-form-item :label="`${this.$i18n.t('lbl.employee_info.birthDate')}`" prop="birthDate">
          <el-date-picker clearable
            v-model="form.birthDate"
            type="date"
            value-format="yyyy-MM-dd"
            :placeholder="`${this.$i18n.t('plh.employee_info.birthDate')}`">
          </el-date-picker>
        </el-form-item>
        <el-form-item :label="`${this.$i18n.t('lbl.employee_info.politicalAffiliation')}`" prop="politicalAffiliation">
          <el-input v-model="form.politicalAffiliation" :placeholder="`${this.$i18n.t('plh.employee_info.politicalAffiliation')}`" />
        </el-form-item>
        <el-form-item :label="`${this.$i18n.t('lbl.employee_info.childrenCount')}`" prop="childrenCount">
          <el-input v-model="form.childrenCount" :placeholder="`${this.$i18n.t('plh.employee_info.childrenCount')}`" />
        </el-form-item>
        <el-form-item :label="`${this.$i18n.t('lbl.employee_info.idNumber')}`" prop="idNumber">
          <el-input v-model="form.idNumber" :placeholder="`${this.$i18n.t('plh.employee_info.idNumber')}`" />
        </el-form-item>
        <el-form-item :label="`${this.$i18n.t('lbl.employee_info.idAddress')}`" prop="idAddress">
          <el-input v-model="form.idAddress" :placeholder="`${this.$i18n.t('plh.employee_info.idAddress')}`" />
        </el-form-item>
        <el-form-item :label="`${this.$i18n.t('lbl.employee_info.contactAddress')}`" prop="contactAddress">
          <el-input v-model="form.contactAddress" :placeholder="`${this.$i18n.t('plh.employee_info.contactAddress')}`" />
        </el-form-item>
        <el-form-item :label="`${this.$i18n.t('lbl.employee_info.mobilePhone')}`" prop="mobilePhone">
          <el-input v-model="form.mobilePhone" :placeholder="`${this.$i18n.t('plh.employee_info.mobilePhone')}`" />
        </el-form-item>
        <el-form-item :label="`${this.$i18n.t('lbl.employee_info.bankAccountNumber')}`" prop="bankAccountNumber">
          <el-input v-model="form.bankAccountNumber" :placeholder="`${this.$i18n.t('plh.employee_info.bankAccountNumber')}`" />
        </el-form-item>
        <el-form-item :label="`${this.$i18n.t('lbl.employee_info.bankName')}`" prop="bankName">
          <el-input v-model="form.bankName" :placeholder="`${this.$i18n.t('plh.employee_info.bankName')}`" />
        </el-form-item>
        <el-form-item :label="`${this.$i18n.t('lbl.employee_info.height')}`" prop="height">
          <el-input v-model="form.height" :placeholder="`${this.$i18n.t('plh.employee_info.height')}`" />
        </el-form-item>
        <el-form-item :label="`${this.$i18n.t('lbl.employee_info.weight')}`" prop="weight">
          <el-input v-model="form.weight" :placeholder="`${this.$i18n.t('plh.employee_info.weight')}`" />
        </el-form-item>
        <el-form-item :label="`${this.$i18n.t('lbl.employee_info.uniformSize')}`" prop="uniformSize">
          <el-input v-model="form.uniformSize" :placeholder="`${this.$i18n.t('plh.employee_info.uniformSize')}`" />
        </el-form-item>
        <el-form-item :label="`${this.$i18n.t('lbl.employee_info.dormitoryResident')}`" prop="dormitoryResident">
          <el-input v-model="form.dormitoryResident" :placeholder="`${this.$i18n.t('plh.employee_info.dormitoryResident')}`" />
        </el-form-item>
        <el-form-item :label="`${this.$i18n.t('lbl.employee_info.firstJobDate')}`" prop="firstJobDate">
          <el-date-picker clearable
            v-model="form.firstJobDate"
            type="date"
            value-format="yyyy-MM-dd"
            :placeholder="`${this.$i18n.t('plh.employee_info.firstJobDate')}`">
          </el-date-picker>
        </el-form-item>
        <el-form-item :label="`${this.$i18n.t('lbl.employee_info.nativePlace')}`" prop="nativePlace">
          <el-input v-model="form.nativePlace" :placeholder="`${this.$i18n.t('plh.employee_info.nativePlace')}`" />
        </el-form-item>
        <el-form-item :label="`${this.$i18n.t('lbl.employee_info.ethnicity')}`" prop="ethnicity">
          <el-input v-model="form.ethnicity" :placeholder="`${this.$i18n.t('plh.employee_info.ethnicity')}`" />
        </el-form-item>
        <el-form-item :label="`${this.$i18n.t('lbl.employee_info.idCardImage')}`" prop="idCardImage">
          <image-upload v-model="form.idCardImage"/>
        </el-form-item>
        <el-form-item :label="`${this.$i18n.t('lbl.employee_info.lastName')}`" prop="lastName">
          <el-input v-model="form.lastName" :placeholder="`${this.$i18n.t('plh.employee_info.lastName')}`" />
        </el-form-item>
        <el-form-item :label="`${this.$i18n.t('lbl.employee_info.firstName')}`" prop="firstName">
          <el-input v-model="form.firstName" :placeholder="`${this.$i18n.t('plh.employee_info.firstName')}`" />
        </el-form-item>
        <el-form-item :label="`${this.$i18n.t('lbl.employee_info.nationality')}`" prop="nationality">
          <el-input v-model="form.nationality" :placeholder="`${this.$i18n.t('plh.employee_info.nationality')}`" />
        </el-form-item>
        <el-form-item :label="`${this.$i18n.t('lbl.employee_info.passportNumber')}`" prop="passportNumber">
          <el-input v-model="form.passportNumber" :placeholder="`${this.$i18n.t('plh.employee_info.passportNumber')}`" />
        </el-form-item>
        <el-form-item :label="`${this.$i18n.t('lbl.employee_info.householdProvince')}`" prop="householdProvince">
          <el-input v-model="form.householdProvince" :placeholder="`${this.$i18n.t('plh.employee_info.householdProvince')}`" />
        </el-form-item>
        <el-form-item :label="`${this.$i18n.t('lbl.employee_info.cardImage')}`" prop="cardImage">
          <image-upload v-model="form.cardImage"/>
        </el-form-item>
        <el-form-item :label="`${this.$i18n.t('lbl.employee_info.idCardValidity')}`" prop="idCardValidity">
          <el-date-picker clearable
            v-model="form.idCardValidity"
            type="date"
            value-format="yyyy-MM-dd"
            :placeholder="`${this.$i18n.t('plh.employee_info.idCardValidity')}`">
          </el-date-picker>
        </el-form-item>
        <el-form-item :label="`${this.$i18n.t('lbl.employee_info.email')}`" prop="email">
          <el-input v-model="form.email" :placeholder="`${this.$i18n.t('plh.employee_info.email')}`" />
        </el-form-item>
        <el-form-item :label="`${this.$i18n.t('lbl.employee_info.highestEducation')}`" prop="highestEducation">
          <el-input v-model="form.highestEducation" :placeholder="`${this.$i18n.t('plh.employee_info.highestEducation')}`" />
        </el-form-item>
        <el-form-item :label="`${this.$i18n.t('lbl.employee_info.otherRequired')}`" prop="otherRequired">
          <el-input v-model="form.otherRequired" :placeholder="`${this.$i18n.t('plh.employee_info.otherRequired')}`" />
        </el-form-item>
        <el-form-item :label="`${this.$i18n.t('lbl.employee_info.healthReportImage')}`" prop="healthReportImage">
          <image-upload v-model="form.healthReportImage"/>
        </el-form-item>
        <el-form-item :label="`${this.$i18n.t('lbl.employee_info.bankCardImage')}`" prop="bankCardImage">
          <image-upload v-model="form.bankCardImage"/>
        </el-form-item>
        <el-form-item :label="`${this.$i18n.t('lbl.employee_info.idCardCopyImage')}`" prop="idCardCopyImage">
          <image-upload v-model="form.idCardCopyImage"/>
        </el-form-item>
        <el-form-item :label="`${this.$i18n.t('lbl.employee_info.jobConfirmImage')}`" prop="jobConfirmImage">
          <image-upload v-model="form.jobConfirmImage"/>
        </el-form-item>
        <el-divider content-position="center">教育经历{{this.$i18n.t("info")}}</el-divider>
        <el-row :gutter="10" class="mb8">
          <el-col :span="1.5">
            <el-button type="primary" icon="el-icon-plus" size="mini" @click="handleAddBvEmployeeEducation">{{this.$i18n.t("btnAdd")}}</el-button>
          </el-col>
          <el-col :span="1.5">
            <el-button type="danger" icon="el-icon-delete" size="mini" @click="handleDeleteBvEmployeeEducation">{{this.$i18n.t("btnDelete")}}</el-button>
          </el-col>
        </el-row>
        <el-table :data="bvEmployeeEducationList" :row-class-name="rowBvEmployeeEducationIndex" @selection-change="handleBvEmployeeEducationSelectionChange" ref="bvEmployeeEducation">
          <el-table-column type="selection" width="50" align="center" />
          <el-table-column :label="`${$i18n.t('serialNumber')}`" align="center" prop="index" width="50"/>
          <el-table-column :label="`${$i18n.t('lbl.employee_info.schoolName')}`" prop="schoolName" width="150">
            <template slot-scope="scope">
              <el-input v-model="scope.row.schoolName" :placeholder="`${$i18n.t('plh.employee_info.schoolName')}`" />
            </template>
          </el-table-column>
          <el-table-column :label="`${$i18n.t('lbl.employee_info.qualifications')}`" prop="qualifications" width="150">
            <template slot-scope="scope">
              <el-input v-model="scope.row.qualifications" :placeholder="`${$i18n.t('plh.employee_info.qualifications')}`" />
            </template>
          </el-table-column>
          <el-table-column :label="`${$i18n.t('lbl.employee_info.degree')}`" prop="degree" width="150">
            <template slot-scope="scope">
              <el-input v-model="scope.row.degree" :placeholder="`${$i18n.t('plh.employee_info.degree')}`" />
            </template>
          </el-table-column>
          <el-table-column :label="`${$i18n.t('lbl.employee_info.professional')}`" prop="professional" width="150">
            <template slot-scope="scope">
              <el-input v-model="scope.row.professional" :placeholder="`${$i18n.t('plh.employee_info.professional')}`" />
            </template>
          </el-table-column>
          <el-table-column :label="`${$i18n.t('lbl.employee_info.qualificationCode')}`" prop="qualificationCode" width="150">
            <template slot-scope="scope">
              <el-input v-model="scope.row.qualificationCode" :placeholder="`${$i18n.t('plh.employee_info.qualificationCode')}`" />
            </template>
          </el-table-column>
          <el-table-column :label="`${$i18n.t('lbl.employee_info.startTime')}`" prop="startTime" width="240">
            <template slot-scope="scope">
              <el-date-picker clearable v-model="scope.row.startTime" type="date" value-format="yyyy-MM-dd" :placeholder="`${$i18n.t('plh.employee_info.startTime')}`" />
            </template>
          </el-table-column>
          <el-table-column :label="`${$i18n.t('lbl.employee_info.endTime')}`" prop="endTime" width="240">
            <template slot-scope="scope">
              <el-date-picker clearable v-model="scope.row.endTime" type="date" value-format="yyyy-MM-dd" :placeholder="`${$i18n.t('plh.employee_info.endTime')}`" />
            </template>
          </el-table-column>
        </el-table>
      </el-form>
      <div slot="footer" class="dialog-footer">
        <el-button type="primary" @click="submitForm">{{this.$i18n.t("formSubmit")}}</el-button>
        <el-button @click="cancel">{{this.$i18n.t("formCancel")}}</el-button>
      </div>
    </el-dialog>
  </div>
</template>

<script>
import { listEmployee_info, getEmployee_info, delEmployee_info, addEmployee_info, updateEmployee_info } from "@/api/hr/employee_info";

export default {
  name: "Employee_info",
  data() {
    return {
      // 遮罩层
      loading: true,
      // 选中数组
      ids: [],
      // 子表选中数据
      checkedBvEmployeeEducation: [],
      // 非单个禁用
      single: true,
      // 非多个禁用
      multiple: true,
      // 显示搜索条件
      showSearch: false,
      // 总条数
      total: 0,
      // 个人基本信息表格数据
      employee_infoList: [],
      // 教育经历表格数据
      bvEmployeeEducationList: [],
      // 弹出层标题
      title: "",
      // 是否显示弹出层
      open: false,
      // 查询参数
      queryParams: {
        pageNum: 1,
        pageSize: 10,
        fullName: null,
        gender: null,
        birthDate: null,
        maritalStatus: null,
        politicalAffiliation: null,
        childrenCount: null,
        idNumber: null,
        idAddress: null,
        contactAddress: null,
        mobilePhone: null,
        bankAccountNumber: null,
        bankName: null,
        height: null,
        weight: null,
        uniformSize: null,
        dormitoryResident: null,
        firstJobDate: null,
        householdType: null,
        nativePlace: null,
        ethnicity: null,
        bloodType: null,
        idCardImage: null,
        lastName: null,
        firstName: null,
        nationality: null,
        passportNumber: null,
        householdProvince: null,
        cardImage: null,
        idCardValidity: null,
        email: null,
        highestEducation: null,
        educationType: null,
        otherRequired: null,
        healthReportImage: null,
        bankCardImage: null,
        idCardCopyImage: null,
        jobConfirmImage: null
      },
      // 表单参数
      form: {},
      // 表单校验
      rules: {
      }
    };
  },
  created() {
    this.getList();
  },
  methods: {
    /** 查询个人基本信息列表 */
    getList() {
      this.loading = true;
      listEmployee_info(this.queryParams).then(response => {
        this.employee_infoList = response.rows;
        this.total = response.total;
        this.loading = false;
      });
    },
    // 取消按钮
    cancel() {
      this.open = false;
      this.reset();
    },
    // 表单重置
    reset() {
      this.form = {
        id: null,
        fullName: null,
        gender: null,
        birthDate: null,
        maritalStatus: null,
        politicalAffiliation: null,
        childrenCount: null,
        idNumber: null,
        idAddress: null,
        contactAddress: null,
        mobilePhone: null,
        bankAccountNumber: null,
        bankName: null,
        height: null,
        weight: null,
        uniformSize: null,
        dormitoryResident: null,
        firstJobDate: null,
        householdType: null,
        nativePlace: null,
        ethnicity: null,
        bloodType: null,
        idCardImage: null,
        lastName: null,
        firstName: null,
        nationality: null,
        passportNumber: null,
        householdProvince: null,
        cardImage: null,
        idCardValidity: null,
        email: null,
        highestEducation: null,
        educationType: null,
        otherRequired: null,
        healthReportImage: null,
        bankCardImage: null,
        idCardCopyImage: null,
        jobConfirmImage: null
      };
      this.bvEmployeeEducationList = [];
      this.resetForm("form");
    },
    /** 搜索按钮操作 */
    handleQuery() {
      this.queryParams.pageNum = 1;
      this.getList();
    },
    /** 重置按钮操作 */
    resetQuery() {
      this.resetForm("queryForm");
      this.handleQuery();
    },
    // 多选框选中数据
    handleSelectionChange(selection) {
      this.ids = selection.map(item => item.id)
      this.single = selection.length!==1
      this.multiple = !selection.length
    },
    /** 新增按钮操作 */
    handleAdd() {
      //this.reset();
      //this.open = true;
      //this.title = `${$i18n.t('titleAddForm')}`;
      //const jobId = 0;
      this.$router.push('/hr/employee_add')
    },
    /** 修改按钮操作 */
    handleUpdate(row) {
      this.reset();
      const id = row.id || this.ids
      getEmployee_info(id).then(response => {
        this.form = response.data;
        this.bvEmployeeEducationList = response.data.bvEmployeeEducationList;
        this.open = true;
        this.title = `${$i18n.t('titleEditForm')}`;
      });
    },
    /** 提交按钮 */
    submitForm() {
      this.$refs["form"].validate(valid => {
        if (valid) {
          this.form.bvEmployeeEducationList = this.bvEmployeeEducationList;
          if (this.form.id != null) {
            updateEmployee_info(this.form).then(response => {
              this.$modal.msgSuccess(`${$i18n.t('editSuccessfully')}`);
              this.open = false;
              this.getList();
            });
          } else {
            addEmployee_info(this.form).then(response => {
              this.$modal.msgSuccess(`${$i18n.t('addSuccessfully')}`);
              this.open = false;
              this.getList();
            });
          }
        }
      });
    },
    /** 删除按钮操作 */
    handleDelete(row) {
      const ids = row.id || this.ids;
      this.$modal.confirm(`${$i18n.t('confirmDetele')}` + ': ' + ids + ' ？').then(function() {
        return delEmployee_info(ids);
      }).then(() => {
        this.getList();
        this.$modal.msgSuccess(`${$i18n.t('deletedSuccessfully')}`);
      }).catch(() => {});
    },
	/** 教育经历序号 */
    rowBvEmployeeEducationIndex({ row, rowIndex }) {
      row.index = rowIndex + 1;
    },
    /** 教育经历添加按钮操作 */
    handleAddBvEmployeeEducation() {
      let obj = {};
      obj.schoolName = "";
      obj.qualifications = "";
      obj.degree = "";
      obj.professional = "";
      obj.qualificationCode = "";
      obj.startTime = "";
      obj.endTime = "";
      obj.remark = "";
      this.bvEmployeeEducationList.push(obj);
    },
    /** 教育经历删除按钮操作 */
    handleDeleteBvEmployeeEducation() {
      if (this.checkedBvEmployeeEducation.length == 0) {
        this.$modal.msgError("请先选择要删除的教育经历数据");
      } else {
        const bvEmployeeEducationList = this.bvEmployeeEducationList;
        const checkedBvEmployeeEducation = this.checkedBvEmployeeEducation;
        this.bvEmployeeEducationList = bvEmployeeEducationList.filter(function(item) {
          return checkedBvEmployeeEducation.indexOf(item.index) == -1
        });
      }
    },
    /** 复选框选中数据 */
    handleBvEmployeeEducationSelectionChange(selection) {
      this.checkedBvEmployeeEducation = selection.map(item => item.index)
    },
    /** 导出按钮操作 */
    handleExport() {
      this.download('hr/employee_info/export', {
        ...this.queryParams
      }, `employee_info_${new Date().getTime()}.xlsx`)
    }
  }
};
</script>
