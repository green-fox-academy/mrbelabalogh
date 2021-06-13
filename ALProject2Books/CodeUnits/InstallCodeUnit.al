codeunit 50110 InstallCodeUnit
{
    Subtype = Install;

    trigger OnInstallAppPerCompany();
    begin

    end;

    procedure InsertProduct(Id: Integer; Name: Text[50])
}