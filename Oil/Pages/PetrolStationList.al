page 50105 PetrolStationList
{
    PageType = List;
    ApplicationArea = All;
    UsageCategory = Administration;
    SourceTable = PetrolStation;
    CardPageId = PetrolStationCard;
    Caption = 'List of Petrol Stations';
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