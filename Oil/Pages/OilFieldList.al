page 50103 OilFieldList
{
    PageType = List;
    ApplicationArea = All;
    UsageCategory = Administration;
    SourceTable = OilFields;
    CardPageId = OilFieldCard;
    Caption = 'List of OilFields';
    Editable = false;

    layout
    {
        area(content)
        {
            repeater(GroupName)
            {

                field(Id; Rec.Id)
                {
                    ApplicationArea = All;
                }

                field(SumOfBarrelOil; Rec.SumOfBarrelOil)
                {
                    ApplicationArea = All;
                }

                field(WeeklyOilIncome; Rec.WeeklyOilIncome)
                {
                    ApplicationArea = All;
                }

                field(MonthlyExpense; Rec.MonthlyExpense)
                {
                    ApplicationArea = All;
                }
                field(Location; Rec.Location)
                {
                    ApplicationArea = All;
                }
            }
        }
    }
}