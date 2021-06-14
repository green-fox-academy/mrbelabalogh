page 50106 PetrolStationCard
{
    PageType = Card;
    ApplicationArea = All;
    UsageCategory = Lists;
    SourceTable = PetrolStation;
    AutoSplitKey = true;
    DelayedInsert = true;

    layout
    {
        area(Content)
        {
            group(General)
            {
                field(Id; Rec.Id)
                {
                    ApplicationArea = All;
                    ShowMandatory = true;
                }

                field(Name; Rec.Name)
                {
                    ApplicationArea = All;
                }

                field(AmountOfEuros; Rec.AmountOfEuros)
                {
                    ApplicationArea = All;
                }
                field(ContractStartDate; Rec.ContractStartDate)
                {
                    ApplicationArea = All;
                }

                field(ContractEndDate; Rec.ContractEndDate)
                {
                    ApplicationArea = All;
                }
            }
        }
    }
}